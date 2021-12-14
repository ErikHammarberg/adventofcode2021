package com.xmas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Lucia {


    int one(String input) {
        var inputs = input.split("\\n");
        var points = Arrays.stream(inputs).filter(s -> s.matches("^\\d+,\\d+")).toList();
        var folds = Arrays.stream(inputs).filter(s -> s.startsWith("fold")).toList();
        var solver = new Folder();
        solver.parsePoints(points);
        solver.fold(folds.get(0));
        return solver.getSize();
    }

    void two (String input) {
        var inputs = input.split("\\n");
        var points = Arrays.stream(inputs).filter(s -> s.matches("^\\d+,\\d+")).toList();
        var folds = Arrays.stream(inputs).filter(s -> s.startsWith("fold")).toList();
        var solver = new Folder();
        solver.parsePoints(points);
        folds.forEach(solver::fold);
        solver.prettyPrint();

    }
    class Folder {

        void prettyPrint() {
            var maxPoint = points.stream().reduce(new Point(0,0), (a, p) -> new Point(Math.max(a.x(), p.x()), Math.max(a.y(), p.y())));
            char [][] painterArray = new char[maxPoint.y()+1][maxPoint.x()+1];
            Arrays.stream(painterArray).forEach(a -> Arrays.fill(a, '.'));

            points.stream().forEach(p -> painterArray[p.y()][p.x()] = '#');
            String result = Arrays.stream(painterArray).reduce("", (s, c) -> s + Arrays.toString(c).replaceAll(",","") + "\n", (a,b)->a );

            System.out.println(result);

        }

        Set<Point> points = new HashSet<>();

        int getSize() {
            return points.size();
        }
        void parsePoints(List<String> input) {
            input.forEach(s -> {
                var sSplit = s.split(",");
                final int x = Integer.parseInt(sSplit[0]);
                final int y = Integer.parseInt(sSplit[1]);
                final Point point = new Point(x, y);
                points.add(point);
            });
        }

        void fold(String input) {
            var splittedInput = input.split("=");
            boolean foldOnX = splittedInput[0].endsWith("x");
            int foldLine = Integer.parseInt(splittedInput[1]);

            var newPoints = points.stream()
                .map(p -> {
                if(foldOnX) {
                    if (p.x() > foldLine) {
                        return new Point(p.x() -(p.x()-foldLine)*2 , p.y());
                    } else if (p.x() < foldLine) {
                        return p;
                    }
                    return null;
                } else {
                    if (p.y() > foldLine) {
                        return new Point(p.x(), p.y() -(p.y()-foldLine)*2 );
                    } else if (p.y() < foldLine) {
                        return p;
                    }
                    return null;

                }
            })
                .filter(p -> p != null)
                .collect(Collectors.toSet());
            points = newPoints;
        }

    }


    record Point(int x, int y){}

}
