package com.xmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day8 {

    /*
    acedgfb cdfbe gcdfa fbcad dab cefabd cdfgeb eafb cagedb ab | cdfeb fcadb cdfeb cdbaf
     */

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
        ONE (1,"c", "f"),
        FOUR (4,"b", "c", "d", "f"),
        SEVEN (7, "a", "c", "f"),
        EIGHT(8, "a", "b", "c", "d", "e", "f", "g");

        int value;
        List<String> segments;
        Digit (int value, String ... segs) {
            this.value = value;
            this.segments = Arrays.asList(segs);
        }
    }

    public int one(String input) {
        var inputs = Util.splitInput(input);

        var stuff = inputs.get(0).split("\\|");
        var hints = Arrays.stream(stuff[0].split("\\s")).sorted((a,b) -> a.length() - b.length()).toList();
        var hintSolver = new Hints();
        hintSolver.parseHint(hints.get(0), Digit.ONE.segments);
        hintSolver.parseHint(hints.get(1), Digit.SEVEN.segments);

        return -1;
    }

    static Map<String, Integer> translator = Map.of("a", 0, "b",1, "c",2, "d",3,"e",4,"f",5,"g",6);

    class Hints {

        int[][] hints = new int[7][7];

        void parseHint(String inputs, List<String> actuals) {
            if(inputs.length() == 2) {
                for(int j = 0; j < inputs.length(); j++) {
                    var s = ""+ inputs.charAt(j);
                    actuals.forEach(i -> hints[translator.get(s)][translator.get(i)] = 1);
                }
            }

            var nopresents = new ArrayList<String>();
            var presents = new ArrayList<String>();
            for(int i = 0; i< inputs.length(); i++) {
                var s = ""+ inputs.charAt(i);
                if(presentInOthers(s, actuals) == 0) {
                    nopresents.add(s);
                } else {
                    presents.add(s);
                }
            }


        }

        int isPresent (String input) {

        }

        int presentInOthers(String input, List<String> actual) {
            var forInput = hints[translator.get(input)];
            int result = 0;
            for(int i = 0; i < forInput.length; i++) {
                final int ii = i;
                if(!actual.stream().map(s -> translator.get(s)).anyMatch(act -> act == ii)) {
                    result += forInput[i];
                }
            }
            return result;
        }

        List<Integer> findWhereUsed(String input) {
            var forInput = hints[translator.get(input)];
            var resultList = new ArrayList<Integer>();
            for(int i = 0; i < forInput.length; i++) {
                if(forInput[i] == 1) {
                    resultList.add(i);
                }
            }
            return resultList;
        }



    }

    record FoundMapping(String input, String actual) {}

}
