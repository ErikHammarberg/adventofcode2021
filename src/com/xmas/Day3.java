package com.xmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day3 {

    public int solveOne(String input) {
        var inputs = Util.splitInput(input);
        var initAray = new int[inputs.get(0).length()];

        int[] resultArray = inputs.stream().reduce(initAray, this::compositeCalcer, (a,b )-> a);

        String result = "";
        String otherResult = "";

        for(var hej : resultArray) {
            result += hej > 0 ? "1" : "0";
            otherResult += hej > 0 ? "0" : "1";
        }

        int firstNum = Integer.parseInt(result, 2);
        int secondNum = Integer.parseInt(otherResult, 2);

        return firstNum * secondNum;








    }

    private int calcer(int previous, int number) {
        return number == '0' ? previous -1 : previous+ 1;
    }

    private final int[] compositeCalcer( int[] theArray,String numbers) {
        final var newArray = new int[theArray.length];
        for (int i = 0; i < numbers.length(); i++) {
            newArray[i] = calcer(theArray[i], numbers.charAt(i));
        }
        return newArray;
    }

}
