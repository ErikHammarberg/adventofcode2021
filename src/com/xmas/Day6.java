package com.xmas;

import java.util.Arrays;

public class Day6 {

    public long solve(String input, int numDays) {


        var nums = Arrays.stream(input.split(","))
            .map(Integer::parseInt)
            .reduce(new long[9], (a, elem) ->
            {
                a[elem]++;
                return a;
            }, (a,b) -> a);


        for(int i = 0 ; i < numDays; i++) {
           nums = stepDay(nums);
        }
        return Arrays.stream(nums).sum();

    }

    long[] stepDay (long[] hej) {
        var result = new long[9];
        for (int inner = 8; inner > 0; inner--) {
            result[inner -1] = hej[inner];
        }
        result[8] = hej[0];
        result[6] += hej[0];
        return result;
    }


}
