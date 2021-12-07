package com.xmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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



    public  long two(String input) {

        var nums = Arrays.stream(input.split(",")).map(Integer::parseInt).toList();
        int maxValue = nums.stream().mapToInt(a -> a).max().getAsInt();

        int[] costs = new int[maxValue];

        nums.forEach(a -> addStepCount(a, costs));
        return Arrays.stream(costs).min().getAsInt();

    }

    void addStepCount(int fromNumber, int[] target) {
        for(int i = 0; i < target.length; i++) {
            target[i]+=fuelcost(fromNumber, i);
        }

    }

    int fuelcost(int fromNumber, int targetNumber) {
        int distance = Math.abs(targetNumber - fromNumber);
        if(distance == 0){
            return 0;
        } else if(distance == 1) {
            return 1;
        }

        int namnare = distance/2;
        int basecalc = ((distance+1) * (distance/2));
        int cost =  basecalc +  (distance %2 == 0 ? 0 : (distance+1)/2);

        return cost;
    }



}
