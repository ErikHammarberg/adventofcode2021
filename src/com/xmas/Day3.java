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


    public int solvTwo(String input) {
        var inputs = Util.splitInput(input);


        var oxy = Integer.parseInt(twoRecusiveOxy(inputs, 0),2);
        var co = Integer.parseInt(twoRecusiveCo(inputs, 0),2);
        return  oxy * co;

    }

    private String twoRecusiveOxy(List<String> strings, int index) {
        int result = 0;
        for(String s : strings) {
            result += s.charAt(index) == '0' ? -1 : 1;
        }
        int finalResult = result;
        var newStrings = strings.stream().filter(s -> s.charAt(index) == (finalResult < 0 ? '0' : '1')).toList();
        if (newStrings.size() == 1) {
            return newStrings.get(0);
        }
        return twoRecusiveOxy(newStrings, index+1);
    }

    private String twoRecusiveCo(List<String> strings, int index) {
        int result = 0;
        for(String s : strings) {
            result += s.charAt(index) == '0' ? -1 : 1;
        }
        int finalResult = result;
        var newStrings = strings.stream().filter(s -> s.charAt(index) == (finalResult >= 0 ? '0' : '1')).toList();
        if (newStrings.size() == 1) {
            return newStrings.get(0);
        }
        return twoRecusiveCo(newStrings, index+1);
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
