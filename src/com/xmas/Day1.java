package com.xmas;

import java.util.Arrays;

public class Day1 {

    public int countIncrease(String input) {
        var ints = Arrays.stream(input.split("\n"))
            .map(Integer::parseInt)
            .toList();

        int increases = 0;
        for(int i = 1 ; i < ints.size(); i++) {
            if (ints.get(i-1) < ints.get(i)) {
                ++increases;
            }
        }
        return increases;
    }


}
