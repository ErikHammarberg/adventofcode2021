package com.xmas;

public class DayTwoAlternate {

    public int solveOne(String input) {
        var intpus = Util.splitInput(input);
        var result = intpus.stream().reduce(new SubOne(0, 0), this::reducer, (a, b) -> a);
        return result.depth() * result.horisontal();
    }

    public int solveTwo(String input) {
        var intpus = Util.splitInput(input);
        var result = intpus.stream().reduce(new SubTwo(0, 0, 0), this::reducer, (a, b) -> a);
        return result.depth() * result.horisontal();
    }

    Sub reducer(Sub sub, String element) {
        var elements = element.split("\\s");
        var value = Integer.parseInt(elements[1]);
        switch (elements[0]) {
            case "forward":
                return sub.forward(value);
            case "down":
                return sub.down(value);
            case "up":
                return sub.up(value);
        }
        throw new RuntimeException("dont be here");
    }


    interface Sub {

        Sub forward(int value);

        Sub up(int value);

        Sub down(int value);

        int depth();

        int horisontal();
    }

    record SubOne(int depth, int horisontal) implements Sub {

        public Sub forward(int value) {
            return new SubOne(depth, horisontal + value);
        }

        public Sub up(int value) {
            return new SubOne(depth - value, horisontal);
        }

        public Sub down(int value) {
            return new SubOne(depth + value, horisontal);
        }
    }

    record SubTwo(int depth, int horisontal, int aim) implements Sub {

        @Override
        public Sub forward(int value) {
            return new SubTwo(depth + aim * value, horisontal + value, aim);
        }

        @Override
        public Sub up(int value) {
            return new SubTwo(depth, horisontal, aim - value);
        }

        @Override
        public Sub down(int value) {
            return new SubTwo(depth, horisontal, aim + value);
        }
    }

}
