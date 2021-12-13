package com.xmas;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Day10 {

    Set<Character> beginSet = Set.of('(', '[', '{', '<');

    Map<Character, Character> pairMap = Map.of('(', ')', '[', ']', '{', '}', '<', '>');
    Map<Character, Integer> valueMap = Map.of(')', 3, ']', 57, '}', 1197, '>', 25137);
    Map<Character, Integer> secondValueMap = Map.of(')', 1, ']', 2, '}', 3, '>', 4);

    long one(String input) {
        return Util.splitInput(input).stream()
            .map(this::checkForFaulty)
            .map(valueMap::get)
            .filter(a -> a != null)
            .mapToInt(a -> a)
            .sum();

    }


    char checkForFaulty(String input) {
        Stack<Character> keeper = new Stack<>();
        char result = (char) input.chars().filter(c -> {
            if (beginSet.contains((char) c)) {
                keeper.push((char) c);
            } else {
                return !pairMap.get(keeper.pop()).equals((char) c);
            }
            return false;
        }).findFirst().orElseGet(() -> 0);
        return result;
    }


    long two(String input) {

        var results = Util.splitInput(input).stream()
            .map(this::fixIncomplete)
            .mapToLong(this::calcStringScore)
            .filter(a -> a > 0)
            .sorted()
            .toArray();
        return results[results.length / 2];
    }

    String fixIncomplete(String input) {
        Stack<Character> keeper = new Stack<>();
        var isFaulty = input.chars().filter(c -> {
            if (beginSet.contains((char) c)) {
                keeper.push((char) c);
            } else {
                return !pairMap.get(keeper.pop()).equals((char) c);
            }
            return false;
        }).findFirst();

        if (isFaulty.isEmpty()) {

            var sb = new StringBuilder();
            for (; !keeper.empty(); ) {
                sb.append(pairMap.get(keeper.pop()));
            }
            return sb.toString();
        }
        return "";
    }

    long calcStringScore(String input) {
        return input.chars().map(i -> secondValueMap.get((char) i)).mapToLong(a -> a)
            .reduce(0l, (accu, elem) -> accu * 5 + elem);

    }


}
