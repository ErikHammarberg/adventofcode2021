package com.xmas;

import java.util.*;

public class Day11 {

    int[][] nums = new int[10][10];

    public int one(String input, int num) {
        nums = parseInput(input);
        int totalBlinkers = 0;

        for(int i = 0; i < num; i++) {
            var blinker = new HashSet<Point>();
            for (int x = 0; x < 10; x++) {
                for(int y = 0; y < 10; y++) {
                    addValue(new Point(x,y), blinker);
                }
            }
            resetFlashed(blinker);
            totalBlinkers += blinker.size();
        }
        return totalBlinkers;
    }

    int[][] parseInput(String input) {

        var inputs = Arrays.stream(input.split("\n"))
                .map(o ->
                    o.chars().map(i -> Integer.parseInt(""+(char)i)).toArray()
                ).toList();

        return inputs.toArray(nums);

    }

    void addValue(Point p, Set<Point> blinkers) {
        if(++nums[p.x()][p.y()] > 9) {
            if (blinkers.add(p)) {
                p.getNeighbours().forEach(pp -> addValue(pp, blinkers));
            }
        }
    }

    void resetFlashed(Collection<Point> flashed) {
        flashed.stream().forEach(p -> nums[p.x()][p.y()] = 0);
    }






    record Point(int x, int y){
        List<Point> getNeighbours() {
            var neighbours = new ArrayList<Point>();
            if (x > 0) {
                neighbours.add(new Point(x-1, y));
                if (y > 0) {
                    neighbours.add(new Point(x-1, y-1));
                }
                if (y < 9) {
                    neighbours.add(new Point(x-1, y+1));

                }
            }
            if (y > 0) {
                neighbours.add(new Point(x, y - 1));
                if(x < 9) {
                    neighbours.add(new Point(x+1,y-1));

                }
            }
            if (y < 9) {
                neighbours.add(new Point(x, y + 1));
                if(x < 9) {
                    neighbours.add(new Point(x+1,y+1));
                }
            }
            if (x < 9) {
                neighbours.add(new Point(x+1, y));
            }
            return neighbours;
        }
    }
}
