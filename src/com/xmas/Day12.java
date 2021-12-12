package com.xmas;

import java.util.*;

public class Day12 {

    int one(String input) {
        populatePaths(input);

        return paths.get("start").stream().mapToInt(e -> walkPath(new Path("start", e), new HashSet<>(),false)).sum();
    }

    int two(String input) {
        populatePaths(input);

        return paths.get("start").stream().mapToInt(e -> walkPath(new Path("start", e), new HashSet<>(),true)).sum();
    }

    Map<String, Set<String>> paths = new HashMap<>();

    void populatePaths(String input)  {
        Arrays.stream(input.split("\n"))
                .forEach(in -> {
                    var toDest = in.split("-");
                    order(toDest);
                    addPath(toDest[0], toDest[1]);
                    if(!toDest[0].equals("start") && !toDest[1].equals("end")) {
                        addPath(toDest[1], toDest[0]);
                    }
                });
    }

    void order(String[] in) {
        if (in[0].equals("end") || in[1].equals("start")) {


            var temp = in[0];
            in[0] = in[1];
            in[1] = temp;
        }
    }
    void addPath(String from, String to) {
        var list = paths.get(from);
        if(list == null) {
            list = new HashSet<>();
            paths.put(from, list);
        }
        list.add(to);
    }


    int walkPath(Path path, Set<String> visited, boolean exploreTwice) {
        if(path.isEnd()) {
            return 1;
        }
        visited.add(path.to());
        var destinations = paths.get(path.to());
        return destinations.stream()
                .mapToInt(dest -> {
                    if(isMajor(dest) || !visited.contains(dest)) {
                        return walkPath(new Path(path.to(), dest), new HashSet<>(visited), exploreTwice);
                    } else if(exploreTwice) {
                        return walkPath(new Path(path.to(),dest), new HashSet<>(visited), false);
                    }
                    return 0;
                } ).sum();
    }

    boolean isMajor(String from) {
        return from.toUpperCase().equals(from);
    }


    record Path(String from, String to){

        boolean isMajor() {
            return from.toUpperCase().equals(from);
        }

        boolean isStart() {
            return "start".equals(from);
        }

        boolean isEnd() {
            return "end".equals(to);
        }

    }
}
