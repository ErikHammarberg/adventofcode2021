package com.xmas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day11Test {

    Day11 sut = new Day11();

    @Test
    public void oneEx () {
        var result = sut.one(example, 10);
        assertEquals(204, result);

    }

    @Test
    public void oneEx2 () {
        var result = sut.one(example, 100);
        assertEquals(1656, result);

    }

    @Test
    public void one () {
        var result = sut.one(input, 100);
        System.out.println(result);
        assertEquals(1755, result);

    }


    @Test
    public void twoEx2 () {
        var result = sut.two(example, 100);
        assertEquals(195, result);

    }

    @Test
    public void two () {
        var result = sut.two(input, 100);
        System.out.println(result);
        assertEquals(212, result);

    }

    String example = """
            5483143223
            2745854711
            5264556173
            6141336146
            6357385478
            4167524645
            2176841721
            6882881134
            4846848554
            5283751526""";

    String input = """
            4472562264
            8631517827
            7232144146
            2447163824
            1235272671
            5133527146
            6511372417
            3841841614
            8621368782
            3246336677""";
}