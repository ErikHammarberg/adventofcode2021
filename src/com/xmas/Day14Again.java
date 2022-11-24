package com.xmas;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day14Again {


    long two(String input, int num) {
        var inputs = Util.splitInput(input);
        var solver = new Solver(inputs);
        solver.performRounds(num);
       return solver.finalCoumt();
    }

//    long calcString(String input) {
//        var calcMap = new HashMap<Integer, Long>();
//        input.chars().forEach(c -> {
//            var n = calcMap.get(c);
//            calcMap.put(c, n != null ? n + 1 : 1);
//        });
//        long max = calcMap.values().stream().mapToLong(a -> a).max().getAsLong();
//        long min = calcMap.values().stream().mapToLong(a -> a).min().getAsLong();
//        return max - min;
//    }

    class Solver {




        String seed;

        Map<String, String> replacerMap = new HashMap<>();
        Map<String, Long> calcerMap = new HashMap<>();

        Solver(List<String> input) {
            seed = input.get(0);
            for (var s : input.subList(2, input.size())) {
                var ss = s.split(" -> ");
                replacerMap.put(ss[0], ss[1]);
            }
//            replacerMap = input.subList(1, input.size()).stream()
//                    .map(s -> {
//                        var ss = s.split(" -> ");
//                        return new AbstractMap.SimpleEntry(ss[0], ss[1]);
//                    })
//                    .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));

            for (int i = 0; i < seed.length()-1; i++ ) {
                var key = seed.substring(i, i+2);
                calcerMap.put(key, 1l + calcerMap.getOrDefault(key, 0l));
            }
        }

        public void performRounds(int num) {
            for (int i = 1; i <= num; i++) {
                var internalMap = new HashMap<String, Long>();
                calcerMap.entrySet().stream()
                        .forEach(e -> {
                            var resultLetter = replacerMap.get(e.getKey());
                            var left = e.getKey().substring(0, 1) + resultLetter;
                            var right = resultLetter + e.getKey().substring(1, 2);
                            internalMap.put(left, e.getValue() + internalMap.getOrDefault(left, 0l));
                            internalMap.put(right, e.getValue() +  internalMap.getOrDefault(right, 0l));
                        });
//                addOrPut(calcerMap ,internalMap);
//                calcerMap.putAll(internalMap);
                calcerMap = internalMap;
            }
        }

        public long finalCoumt() {
            var numMap = new HashMap<String, Long>();
            numMap.put(seed.substring(0,1), 1l);
            var secondKey = seed.substring(seed.length()-1);
            numMap.put(secondKey, 1l + numMap.getOrDefault(secondKey, 0l));
            calcerMap.entrySet().stream()
                    .forEach(e -> {
                        var left = e.getKey().substring(0,1);
                        numMap.put(left, numMap.getOrDefault(left, 0l) + e.getValue());
                        var right = e.getKey().substring(1);
                        numMap.put(right, numMap.getOrDefault(right, 0l) + e.getValue());
                    });
            var max = numMap.values().stream().mapToLong(l -> l).max().getAsLong();
            var min = numMap.values().stream().mapToLong(l -> l).min().getAsLong();
            return (max / 2) - (min / 2);
        }
    }

    public void addOrPut(Map<String, Long> big, Map<String, Long> withAdd) {
        withAdd.entrySet().stream()
                .forEach(entry -> {
                    long value = big.getOrDefault(entry.getKey(), 0L) + entry.getValue();
                    big.put(entry.getKey(), value);
                });
    }

}
