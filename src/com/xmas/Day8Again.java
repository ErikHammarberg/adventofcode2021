package com.xmas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

        var stuff = inputs.get(0).split("\\|");
        var hints = Arrays.stream(stuff[0].split("\\s")).sorted((a,b) -> a.length() - b.length()).toList();
        var garbledDigits = inputs.stream().map(s -> s.split("\\|")[1])
                .map(s -> s.split("\\s")).toList();




        return  -1;
    }

    private void translate(List<String> hints) {

        var solver = new HashMap<String, Integer>();
        var reverseSolved = new HashMap<Integer, String >();

        solver.put(hints.get(0),1);
        reverseSolved.put(1, hints.get(0));
        solver.put(hints.get(1), 7);
        reverseSolved.put(7, hints.get(1));





    }

    private Set<Character> strinToCharSet(String in) {
        return in.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.toSet());
    }
}
