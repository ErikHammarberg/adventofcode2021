package com.xmas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day14 {

    long one(String input, int num) {
        var inputs = Util.splitInput(input);
        var solver = new Solver();
        solver.parseReplaceMap(inputs.subList(2, inputs.size()));
        String resultString = inputs.get(0);
        for (int i = 0; i < num; i++) {
            resultString = solver.replaceRound(resultString);
        }


        return calcString(resultString);
    }

    long calcString(String input) {
        var calcMap = new HashMap<Integer, Long>();
        input.chars().forEach(c -> {
            var n = calcMap.get(c);
            calcMap.put(c, n != null ? n+1: 1);
        });
        long max = calcMap.values().stream().mapToLong(a ->a).max().getAsLong();
        long min = calcMap.values().stream().mapToLong(a -> a).min().getAsLong();
        return max - min;
    }

    class Solver {
        Map<String, String> solverMap = new HashMap<>();

        void parseReplaceMap(List<String> inputs) {
            var map = inputs.stream()
                .map(s -> s.split(" -> "))
                .map(sa ->  Map.entry(sa[0], sa[1]))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            solverMap = new HashMap<>(map);
        }

        String replaceRound(String baseString) {
            var sb = new StringBuilder().append(baseString.charAt(0));

            for (int i = 0; i +1 < baseString.length(); i++)  {
                final var subString = baseString.substring(i, i+2);
                final var replacement = solverMap.get(subString);
                if(replacement != null) {
                    sb.append(replacement).append(subString.charAt(1));
                } else {
                    sb.append(subString.charAt(1));
                }
            }
            return sb.toString();
        }
    }

}
