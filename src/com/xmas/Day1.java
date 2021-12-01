package com.xmas;

import java.util.Arrays;
import java.util.List;
import javax.swing.CellEditor;

public class Day1 {

    public int countIncrease(String input) {
        List<Integer> ints = getInts(input);

        record DepthReducer (
            int previousDepth, int count){}

        var result = ints.stream().reduce(new DepthReducer(Integer.MAX_VALUE, 0), (previousDepth, element) ->
        {
            int count = previousDepth.count;
            if (previousDepth.previousDepth < element){
                count++;
            }
            return new DepthReducer(element, count);
        }
        ,(a, b) -> a);

        return result.count();
    }

    private List<Integer> getInts(String input) {
        var ints = Arrays.stream(input.split("\n"))
            .map(Integer::parseInt)
            .toList();
        return ints;
    }

    public int countWindowIncrease(String input) {
        var ints = getInts(input);

        record DepthReducer (
            int p1, int p2, int p3, int count
        ){
            public int summa() {
                return p1 + p2 +p3;
            }
        }

        var result = ints.stream().reduce(new DepthReducer(Integer.MAX_VALUE/4, Integer.MAX_VALUE/4, Integer.MAX_VALUE/4, 0),
            (previous, element) -> {
            int count = previous.count();;
                if(previous.summa() < previous.p2() + previous.p3() + element) {
                    count++;
                }
                return new DepthReducer(previous.p2(), previous.p3(), element, count);
            },
            (a,b)->a);

        return result.count();

    }


}
