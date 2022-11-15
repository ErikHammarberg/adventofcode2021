package com.xmas;

import java.util.*;
import java.util.stream.Collectors;

public class Day8Again {
    /*
       0:      1:      2:      3:      4:
 aaaa    ....    aaaa    aaaa    ....
b    c  .    c  .    c  .    c  b    c
b    c  .    c  .    c  .    c  b    c
 ....    ....    dddd    dddd    dddd
e    f  .    f  e    .  .    f  .    f
e    f  .    f  e    .  .    f  .    f
 gggg    ....    gggg    gggg    ....

  5:      6:      7:      8:      9:
 aaaa    aaaa    aaaa    aaaa    aaaa
b    .  b    .  .    c  b    c  b    c
b    .  b    .  .    c  b    c  b    c
 dddd    dddd    ....    dddd    dddd
.    f  e    f  .    f  e    f  .    f
.    f  e    f  .    f  e    f  .    f
 gggg    gggg    ....    gggg    gggg
     */
    enum Digit {
        ZERO(0, 'a', 'b', 'c', 'e', 'f', 'g'),
        ONE (1,'c', 'f'),
        TWO (2, 'a', 'c','d', 'e', 'd'),
        FOUR (4,'b', 'c', 'd', 'f'),
        SEVEN (7, 'a', 'c', 'f'),
        EIGHT(8, 'a', 'b', 'c', 'd', 'e', 'f', 'g');

        int value;
        List<Character> segments;
        Digit (int value, Character ... segs) {
            this.value = value;
            this.segments = Arrays.asList(segs);
        }
    }

    public long hello(String input) {
        var inputs = Util.splitInput(input);

        return inputs.stream().mapToInt(this::valueOfRow).sum();
    }

    private int valueOfRow(String inputRow) {
        var allDigits = inputRow.split("\\|");
        var hints = Arrays.stream(allDigits[0].trim().split("\\s"))
                .map(this::sortString)
                .sorted((a,b) -> a.length() - b.length()).toList();


        var garbledDigits = allDigits[1].trim().split("\\s");


        var solverMap = translate(hints);
        var value = Integer.parseInt( Arrays.stream(garbledDigits)
                .map(this::sortString)
                .map(s -> solverMap.get(s))
                .map(String::valueOf)
                .reduce("",(s, i) -> s + i));


        return value;
    }

    private String sortString(String input) {
        var chars =input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private HashMap<String, Integer> translate(List<String> hints) {

        var solver = new HashMap<String, Integer>();
        var reverseSolved = new HashMap<Integer, String >();

        solver.put(hints.get(0),1);
        reverseSolved.put(1, hints.get(0));
        solver.put(hints.get(1), 7);
        reverseSolved.put(7, hints.get(1));
        solver.put(hints.get(2), 4);
        reverseSolved.put(4, hints.get(2));
        solver.put(hints.get(hints.size()-1), 8);
        reverseSolved.put(8, hints.get(hints.size()-1));

        var fives = hints.stream().filter(s -> s.length() == 5).toList();

        var three = fives.stream().filter(s -> 2 == countCharsInString(s, reverseSolved.get(1))).findFirst().get();
        solver.put(three, 3);
        reverseSolved.put(3, three);
        fives.stream().filter(s -> !s.equals(three))
                .map(s -> {
                    var num = countCharsInString(s, reverseSolved.get(4)) == 2 ? 2 : 5;
                    return new AbstractMap.SimpleEntry (s, num);
                }).forEach(entry -> {
                    solver.put((String)entry.getKey(), (Integer)entry.getValue());
                    reverseSolved.put((Integer)entry.getValue(), (String)entry.getKey());
                });

        var sixes = hints.stream().filter(s -> s.length() == 6).toList();
        for (var s : sixes) {
            if (countCharsInString(s, reverseSolved.get(4)) == 4) {
                solver.put(s, 9);
                reverseSolved.put(9, s);
            } else if (countCharsInString(s, reverseSolved.get(1)) == 2) {
                solver.put(s, 0);
                reverseSolved.put(0, s);
            } else {
                solver.put(s, 6);
                reverseSolved.put(6, s);
            }
        }
        return solver;
    }

    private int countCharsInString(String bigOne, String chars) {
        return (int) chars.chars().filter(c -> bigOne.contains(""+(char)c)).count();
    }

    private Set<Character> strinToCharSet(String in) {
        return in.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.toSet());
    }
}
