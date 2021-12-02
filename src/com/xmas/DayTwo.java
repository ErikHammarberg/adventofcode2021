package com.xmas;

public class DayTwo {

    public int solveOne(String input) {
        var inputs = Util.splitInput(input);

        Sub solverSub = new Sub();
        inputs.forEach(line -> {
            var instr = line.split("\\s");
            solverSub.takeInstruction(instr[0], Integer.parseInt(instr[1]));
        });
        return solverSub.getAnswer();
    }

    public int solveTwo(String input) {
        var inputs = Util.splitInput(input);

        Sub solverSub = new BetterSub();
        inputs.forEach(line -> {
            var instr = line.split("\\s");
            solverSub.takeInstruction(instr[0], Integer.parseInt(instr[1]));
        });
        return solverSub.getAnswer();
    }

    class Sub {
        int horPosition;
        int depth;

        public void takeInstruction(String insctruction, int value) {
            switch (insctruction) {
                case
                    "forward" -> forward(value);
                case
                    "down" -> down(value);
                case
                    "up" -> up(value);
            }
        }

        public void forward(int value) {
            horPosition+= value;
        }
        public void down(int value) {
            depth +=value;
        }

        public void up(int value) {
            depth -= value;
        }

        public int getAnswer() {
            return horPosition * depth;
        }
    }

    class BetterSub extends Sub {
        int aim;

        @Override
        public void forward(int value) {
            super.forward(value);
            depth += aim * value;
        }

        @Override
        public void up(int value) {
            aim -= value;
        }

        @Override
        public void down(int value) {
            aim += value;
        }
    }

}
