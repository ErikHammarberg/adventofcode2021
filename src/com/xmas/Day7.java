package com.xmas;

import java.util.Arrays;

public class Day7 {
    public long one(String input) {
        // Find median
        var sortedNums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).sorted().toArray();
        final int target = findMedian(sortedNums);
        int cost = Arrays.stream(sortedNums).reduce(0,(ack, elem) -> ack + Math.abs(elem - target));
        return cost;


    }

    int findMedian(int[] sortedNums) {
        if(sortedNums.length % 2 ==0) {
            int half = sortedNums.length/2;
            return (sortedNums[half] + sortedNums[half-1]) / 2;
        } else {
            int half = sortedNums.length/2;
            return sortedNums[half];
        }
    }

}
