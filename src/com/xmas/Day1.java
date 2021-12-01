package com.xmas;

import java.util.Arrays;

public class Day1 {

    public int countIncrease(String input) {
        var ints = Arrays.stream(input.split("\n"))
            .map(Integer::parseInt)
            .toList();


        var result = ints.stream().reduce(new DepthReducer(Integer.MAX_VALUE, 0), (previousDepth, element) ->
        {
            int count = previousDepth.count;
            if (previousDepth.previousDepth < element){
                count++;
            }
            return new DepthReducer(element, count);
        }
        ,(a, b) -> a);

        return result.count;

    }

    record DepthReducer (
        int previousDepth, int count){}
}
