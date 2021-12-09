package com.xmas;

import java.util.ArrayList;
import java.util.List;

public class Day9 {

    /**
     * Find local sincs by up, down, righ, left
     *
     * 2199943210
     * 3987894921
     * 9856789892
     * 8767896789
     * 9899965678
     */


    public int one(String input) {
        var sincs = findSincs(input);
        var result = sincs.stream().reduce(0,(accu, elem) -> accu + elem +1);
        return result;
    }

    List<Integer> findSincs(String input) {
        var result = new ArrayList<Integer>();
        var rows = input.split("\n");
        for (int i = 0 ; i < rows.length; i++) {

            for(int inner = 0; inner < rows[i].length(); inner++) {
                final int up = i > 0 ? Integer.parseInt(rows[i-1].substring(inner, inner+1)): Integer.MAX_VALUE;
                final int down = i+1 < rows.length ?  Integer.parseInt(rows[i+1].substring(inner, inner+1)): Integer.MAX_VALUE;
                final int left = inner > 0 ?  Integer.parseInt(rows[i].substring(inner-1, inner)): Integer.MAX_VALUE;
                final int right = inner +1 < rows[i].length() ?  Integer.parseInt(rows[i].substring(inner+1, inner+2)): Integer.MAX_VALUE;

                final int elem = Integer.parseInt(rows[i].substring(inner, inner+1));
                if(elem < up &&
                    elem < down &&
                    elem < left &&
                    elem < right) {
                    result.add(elem);
                }
            }


        }
        return result;
    }
}
