package com.xmas;

import java.util.*;

public class Day4 {

    public int solveOne(String input) {
        var inputs = Util.splitInput(input);

        List<BingoBoard> boards = new ArrayList<>();

        for(int i = 2 ; i < inputs.size(); i+=6 ) {
            boards.add(
                    new BingoBoard(inputs.subList(i , i+5))
            );
        }

        for (String s:  inputs.get(0).split(",")) {
            int num = Integer.parseInt(s);
            for(var board : boards) {
                var result = board.parseNumber(num);
                if(result > 0) {
                    return result * num;
                }
            }

        }
        return -45;
    }

    public int solveTwo(String input) {
        var inputs = Util.splitInput(input);

        List<BingoBoard> boards = new ArrayList<>();

        for(int i = 2 ; i < inputs.size(); i+=6 ) {
            boards.add(
                    new BingoBoard(inputs.subList(i , i+5))
            );
        }

        int lastToWin = -1;

        for (String s:  inputs.get(0).split(",")) {
            int num = Integer.parseInt(s);

            for(var literator = boards.listIterator(); literator.hasNext(); ) {
                var board = literator.next();
                var result = board.parseNumber(num);
                if(result > 0) {
                    lastToWin = result * num;
                    literator.remove();
                }
            }

        }
        return lastToWin;
    }

    class BingoBoard {
        Map<Integer, BoardPosition> positionSearchMap = new TreeMap<>();
        int[][] checked = new int[5][5];

        BingoBoard(List<String> input) {
            for ( int i = 0; i < input.size(); i++) {
                var lineSplits = input.get(i).trim().split("\\s+");
                for(int inner = 0; inner < lineSplits.length; inner++) {
                    positionSearchMap.put(Integer.parseInt(lineSplits[inner]), new BoardPosition(i, inner));
                }
            }
        }

        int parseNumber(int number) {
            var position = positionSearchMap.get(number);
            if(position == null ) {
                return -1;
            }
            checked[position.x][position.y] = 1;
            boolean horWin = Arrays.stream(checked[position.x]).sum() == 5;
            boolean verWin = Arrays.stream(checked).map(ray -> ray[position.y]).mapToInt(a -> a).sum() == 5;

            if (horWin || verWin) {
                int value = 0;

                for(int i = 0; i < checked.length; i ++) {
                    for (int inner = 0; inner < checked.length; inner++) {
                        if(checked[i][inner] == 0) {
                            int x = i;
                            int y = inner;
                            value += positionSearchMap.entrySet().stream()
                                    .filter(entry -> entry.getValue().equals(new BoardPosition(x, y)))
                                    .map(entry -> entry.getKey())
                                    .findFirst()
                                    .get();
                        }
                    }
                }
                return value;
            }
            return -1;

        }
    }

    record BoardPosition (int x, int y) {

    }
}
