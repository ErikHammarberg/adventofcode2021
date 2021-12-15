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

    long two(String input, int num) {
        var inputs = Util.splitInput(input);
        var solver = new Solver();
        solver.parseReplaceMap(inputs.subList(2, inputs.size()));
        String seedString = inputs.get(0);
        var resultMap = solver.initReplacer(inputs.get(0), num);
        long max = resultMap.values().stream().mapToLong(a -> a).max().getAsLong();
        long min = resultMap.values().stream().mapToLong(a -> a).min().getAsLong();
        return max - min;
    }

    long calcString(String input) {
        var calcMap = new HashMap<Integer, Long>();
        input.chars().forEach(c -> {
            var n = calcMap.get(c);
            calcMap.put(c, n != null ? n + 1 : 1);
        });
        long max = calcMap.values().stream().mapToLong(a -> a).max().getAsLong();
        long min = calcMap.values().stream().mapToLong(a -> a).min().getAsLong();
        return max - min;
    }

    class Solver {

        Map<String, String> solverMap = new HashMap<>();
        Map<String, Long> calcerMap = new HashMap<>();

        void parseReplaceMap(List<String> inputs) {
            var map = inputs.stream()
                .map(s -> s.split(" -> "))
                .map(sa -> Map.entry(sa[0], sa[1]))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            solverMap = new HashMap<>(map);
        }

        String replaceRound(String baseString) {
            var sb = new StringBuilder().append(baseString.charAt(0));

            for (int i = 0; i + 1 < baseString.length(); i++) {
                final var subString = baseString.substring(i, i + 2);
                final var replacement = solverMap.get(subString);
                if (replacement != null) {
                    sb.append(replacement).append(subString.charAt(1));
                } else {
                    sb.append(subString.charAt(1));
                }
            }
            return sb.toString();
        }

        Map<String, Long> initReplacer(String input, int rounds) {

            for (int i = 0; i+1 < input.length(); i++) {

                    secondReplacer(input.substring(i, i + 2), rounds);


            }

            input.chars().forEach(i -> {
                var old = calcerMap.getOrDefault(""+(char)i, 0l);
                calcerMap.put(""+(char)i, old + 1);
            });
            return calcerMap;
        }

        void secondReplacer(String input, int round) {
            if (round < 1) {
                return ;
            }
            var inputer = solverMap.get(input);

                secondReplacer("" + input.charAt(0) + inputer, round - 1);
                secondReplacer("" + inputer + input.charAt(1), round - 1);

            var oldValue = calcerMap.getOrDefault(inputer, 0l);
            calcerMap.put(inputer, oldValue + 1);
        }

        Map<String, Long> mergeMaps(Map<String, Long> a, Map<String, Long> b) {
            a.entrySet().stream().forEach(ae -> {
                var be = b.getOrDefault(ae.getKey(), 0l);
                b.put(ae.getKey(), ae.getValue() + be);
            });
            return b;
        }
    }

}
