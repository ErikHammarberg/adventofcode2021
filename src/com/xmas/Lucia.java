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
    class Folder {

        Set<Point> points = new HashSet<>();
//        SortedSet<Point> xSorted = new TreeSet<Point>((p1, p2) -> p2.x() - p1.x());
//        SortedSet<Point> ySorted = new TreeSet<>((p1, p2) -> p2.y() - p1.y());

        int getSize() {
            return points.size();
        }
        void parsePoints(List<String> input) {
            input.forEach(s -> {
                var sSplit = s.split(",");
                final int x = Integer.parseInt(sSplit[0]);
                final int y = Integer.parseInt(sSplit[1]);
                final Point point = new Point(x, y);
//                xSorted.add(point);
//                ySorted.add(point);
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
