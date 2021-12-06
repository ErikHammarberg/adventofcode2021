package com.xmas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Day5 {

    public long solveOne(String input, boolean diagonal) {

        var inputs = Util.splitInput(input);

        var pointMap = new HashMap<Pooint, Integer>();

        inputs.stream().flatMap(in -> findPoints(in, diagonal).stream())
                .forEach(pooint -> {
                    var existing = pointMap.get(pooint);
                    var result = existing != null ? existing+1 : 1;
                    pointMap.put(pooint, result);
                });
        return pointMap.values().stream().filter(a -> a >1 ).count();
    }

    List<Pooint> findPoints(String input, boolean diagonal) {
        Pattern p = Pattern.compile("(\\d+),(\\d+) -> (\\d+),(\\d+)");
        var m = p.matcher(input);
        m.find();
        int fromX = Integer.parseInt(m.group(1));
        int fromY = Integer.parseInt(m.group(2));
        int toX = Integer.parseInt(m.group(3));
        int toY = Integer.parseInt(m.group(4));

        if (fromX == toX) {
            int highY = Math.max(fromY, toY);
            int lowY = Math.min(fromY, toY);
            return IntStream.range(lowY, highY+1).mapToObj(i -> new Pooint(fromX, i)).toList();
        } else if(fromY == toY ) {
            int highX = Math.max(fromX, toX);
            int lowX = Math.min(fromX, toX);
            return IntStream.range(lowX, highX+1).mapToObj(i -> new Pooint(i, fromY)).toList();
        } else if(diagonal){
            var diagonalList = new ArrayList<Pooint>();
            int x = fromX;
            int y = fromY;
            for(; x != toX; ) {
                diagonalList.add(new Pooint(x, y));
                x = fromX < toX ? x+1 : x-1;
                y = fromY < toY ? y+1 : y-1;
            }
            diagonalList.add(new Pooint(x,y));
            return diagonalList;
        }

     return    List.of();
    }

    record Pooint(int x, int y){};
}
