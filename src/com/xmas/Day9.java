package com.xmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day9 {

    public int one(String input) {
        var sincs = findSincs(input);
        var result = sincs.stream().reduce(0,(accu, elem) -> accu + elem +1);
        return result;
    }

    public int two(String input) {
        var basis = findBasins(input);
        return basis.get(0) * basis.get(1) * basis.get(2);
    }

    List<Integer> findSincs(String input) {
        var result = new ArrayList<Integer>();
        var rows = input.split("\n");
        for (int i = 0 ; i < rows.length; i++) {

            for(int inner = 0; inner < rows[i].length(); inner++) {
                final int up = i > 0 ? Integer.parseInt(rows[i-1].substring(inner, inner+1)): Integer.MAX_VALUE;
                final int down = i+1 < rows.length ?  Integer.parseInt(rows[i+1].substring(inner, inner+1)): Integer.MAX_VALUE;
                final int left = inner > 0 ?  Integer.parseInt(rows[i].substring(inner-1, inner)): Integer.MAX_VALUE;
                final int right = inner +1 < rows[i].length() ?  Integer.parseInt(rows[i].substring(inner+1, inner+2)): Integer.MAX_VALUE;

                final int elem = Integer.parseInt(rows[i].substring(inner, inner+1));
                if(elem < up &&
                    elem < down &&
                    elem < left &&
                    elem < right) {
                    result.add(elem);
                }
            }
        }
        return result;
    }


    List<Integer> findBasins(String input) {

        var result = new ArrayList<Integer>();
        var rows = input.split("\n");

        int[][] basins = new int[rows.length][rows[0].length()];
        var duplicateHandler = new DublicateHandler();

        int nextBasin = 1;

        for (int i = 0; i < rows.length; i++) {

            for (int inner = 0; inner < rows[i].length(); inner++) {
                final int elem = Integer.parseInt(rows[i].substring(inner, inner + 1));

                if (elem < 9) {

                    final int up = i > 0 ? (basins[i - 1][inner]) : 0;
//                final int down = i+1 < rows.length ?  Integer.parseInt(rows[i+1].substring(inner, inner+1)): Integer.MAX_VALUE;
                    final int left = inner > 0 ? basins[i][inner - 1] : 0;
//                final int right = inner +1 < rows[i].length() ?  Integer.parseInt(rows[i].substring(inner+1, inner+2)): Integer.MAX_VALUE;

                    if (left > 0) {
                        basins[i][inner] = left;
                    } else if (up > 0) {
                        basins[i][inner] = up;
                    } else {
                        basins[i][inner] = nextBasin++;
                    }

                    if (up > 0 && left > 0 && up != left) {
                        duplicateHandler.addDuplicate(up, left);
                    }

                }
            }
        }

        Map<Integer, Integer> solution = new HashMap();

        Arrays.stream(basins).flatMapToInt(s -> Arrays.stream(s)).filter(i -> i !=0).forEach(i -> {

            int key = duplicateHandler.replaceDuplicate(i);
            var current = solution.get(key);
            int num = current != null ? current +1 : 1;
            solution.put(key, num);
        });

        return solution.values().stream().sorted((a, b) -> b-a).toList();


    }


    class DublicateHandler {
        List<Set<Integer>> duplicateStore = new ArrayList<>();

        public int replaceDuplicate(int i) {
            var set = findDuplicates(i);
            return set.first();
        }

        public SortedSet<Integer> findDuplicates(int i) {
            var duplicateSet = duplicateStore.stream().filter(s -> s.contains(i)).toList();
            if(duplicateSet.size() > 1) {
                throw new RuntimeException("don be here");
            }
            if(duplicateSet.size() > 0) {
                return    new TreeSet<Integer>(duplicateSet.get(0));
            } else {
                var set = new TreeSet<Integer>();
                set.add(i);
                return set;
            }
        }

        public void addDuplicate(int a, int b) {
            var duplicateSet = duplicateStore.stream().filter(s -> s.contains(a) || s.contains(b)).toList();
            if(duplicateSet.size() == 0) {
                var newSet = new HashSet<Integer>();
                newSet.add(a);
                newSet.add(b);
                duplicateStore.add(newSet);
            } else if(duplicateSet.size() == 1) {
                duplicateSet.get(0).add(a);
                duplicateSet.get(0).add(b);
            } else if(duplicateSet.size() == 2) {
                var one = duplicateSet.get(0);
                var two =duplicateSet.get(1);
                one.addAll(two);
                one.add(a);
                one.add(b);
                duplicateStore.remove(two);
            }
        }
    }
}
