package com.xmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day6 {

    public int solveOne(String input, int numDays) {
        var nums = Arrays.stream(input.split(",")).map(Integer::parseInt).map(Fish::new).toList();

        List<Fish> resultList = new ArrayList<>();
        resultList.addAll(nums);
        for(int i = 0; i < numDays; i++) {
            var newList = resultList.stream().map(Fish::passDay).filter(f -> f != null).toList();
            resultList.addAll(newList);
        }
        return resultList.size();
    }

    class Fish {
        int daysToHatch;
        Fish(int daysToHatch) {
            this.daysToHatch = daysToHatch;
        }

        Fish passDay() {
            if (daysToHatch == 0) {
                daysToHatch = 6;
                return new Fish(8);
            } else {
                daysToHatch--;
                return null;
            }
        }
    }
}
