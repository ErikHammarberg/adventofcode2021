package com.xmas;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Day10 {

    Set<Character> beginSet = Set.of('(','[','{','<');

    Map<Character,Character> pairMap = Map.of('(',')','[',']','{','}','<','>');
    Map<Character, Integer> valueMap = Map.of(')',3, ']', 57, '}', 1197, '>', 25137);

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
        char result = (char)input.chars().filter(c -> {
            if (beginSet.contains((char)c)) {
                keeper.push((char)c);
            } else {
                return !pairMap.get(keeper.pop()).equals((char)c);
            }
            return false;
        }).findFirst().orElseGet(()->0);
        return result;
    }




}
