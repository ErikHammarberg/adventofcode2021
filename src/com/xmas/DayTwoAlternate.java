package com.xmas;

import com.xmas.DayTwo.Sub;
import java.util.function.BiFunction;

public class DayTwoAlternate {

    public int solveOne(String input) {
        var intpus = Util.splitInput(input);
        var result = intpus.stream().reduce(new Sub(0,0), this::reducer, (a, b) -> a);
        return result.depth * result.horisontal;

    }

    Sub reducer(Sub sub, String element) {
        var elements = element.split("\\s");
        var value = Integer.parseInt(elements[1]);
        switch (elements[0]) {
            case "forward" : return sub.forward(value);
            case "down" : return sub.down(value);
            case "up" : return sub.up(value);
        }
        throw new RuntimeException("dont be here");
    }



    record Sub(int depth, int horisontal){
        Sub forward (int value) {
           return new Sub(depth, horisontal + value);
        }

        Sub up (int value) {
            return new Sub(depth - value, horisontal);
        }

        Sub down(int value) {
            return new Sub(depth + value, horisontal);
        }
    }

}
