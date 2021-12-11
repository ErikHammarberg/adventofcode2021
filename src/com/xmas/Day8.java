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

        Map<String, FoundMapping> mappings = new HashMap<>();

        void parseHint(String inputs, List<String> actuals) {
            if(inputs.length() == 2) {
                for(int j = 0; j < inputs.length(); j++) {
                    var s = ""+ inputs.charAt(j);
                    actuals.forEach(i -> hints[translator.get(s)][translator.get(i)] = 1);
                }
            }

            var notUsed = new ArrayList<String>();
            var mappedActs = new ArrayList<Integer>();
            for(int i = 0; i< inputs.length(); i++) {
                var s = "" + inputs.charAt(i);
                var used = findWhereUsed(s);
                if(used.size() == 0) {
                    notUsed.add(s);
                } else {
                    var actualsNotInThisCall = used.stream()
                        .filter(use -> actuals.stream()
                            .map(inpa -> translator.get(inpa)).anyMatch(inpAct -> inpAct.equals(use))
                        ).toList();
                    actualsNotInThisCall.forEach(ac -> hints[translator.get(s)][ac] = 0);
                    mappedActs.addAll(used);
                }
            }

            actuals.stream()
                .map(ac -> translator.get(ac))
                .filter(ac -> !mappedActs.contains(ac)).forEach(ac -> {
                notUsed.stream().map(translator::get).forEach(inp -> hints[inp][ac] = 1);
            });
            searchMappings();

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

        void searchMappings() {
            for (int i = 0; i < hints.length; i ++) {
                int numHints = 0;
                int lastOne = -1;
                for (int inner = 0; inner < hints[i].length; inner++) {
                    if(hints[i][inner] > 0) {
                        numHints++;
                        lastOne = inner;
                    }
                }
                if(numHints == 1) {
                    var mapping = new FoundMapping(reversParse(i), reversParse(lastOne));
                    mappings.put(reversParse(i), mapping);
                }
            }
        }
        String reversParse(int in){
            return translator.entrySet().stream()
                    .filter(e -> e.getValue().equals(in)).map(e -> e.getKey())
                    .findFirst().get();
        }

        String removeFoundMappings(String inputs, List<String> actuals) {
            for(int i = 0; i < inputs.length(); i++) {
                var actual = mappings.get(""+inputs.charAt(i));
                if (actual != null) {

                }
             }
            // not done
            return "";
        }




//        int presentInOthers(String input, List<String> actual) {
//            var forInput = hints[translator.get(input)];
//            int result = 0;
//            for(int i = 0; i < forInput.length; i++) {
//                final int ii = i;
//                if(!actual.stream().map(s -> translator.get(s)).anyMatch(act -> act == ii)) {
//                    result += forInput[i];
//                }
//            }
//            return result;
//        }





    }

    record FoundMapping(String input, String actual) {}

}
