package com.xmas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day6Test {

    Day6 sut = new Day6();
    @Test
    public void exampleOne() {
        var resutl = sut.solveOne(example, 80);
        assertEquals(5934, resutl);
    }

    @Test
    public void One() {
        var resutl = sut.solveOne(input, 80);
        System.out.println(resutl);
        assertEquals(349549, resutl);
    }

    @Test
        public void TwoExample() {
        var result = sut.solveOne(example, 256);
        assertEquals(26984457539l, result);
    }

    String example = """
        3,4,3,1,2""";

    String input = "1,4,2,4,5,3,5,2,2,5,2,1,2,4,5,2,3,5,4,3,3,1,2,3,2,1,4,4,2,1,1,4,1,4,4,4,1,4,2,4,3,3,3,3,1,1,5,4,2,5,2,4,2,2,3,1,2,5,2,4,1,5,3,5,1,4,5,3,1,4,5,2,4,5,3,1,2,5,1,2,2,1,5,5,1,1,1,4,2,5,4,3,3,1,3,4,1,1,2,2,2,5,4,4,3,2,1,1,1,1,2,5,1,3,2,1,4,4,2,1,4,5,2,5,5,3,3,1,3,2,2,3,4,1,3,1,5,4,2,5,2,4,1,5,1,4,5,1,2,4,4,1,4,1,4,4,2,2,5,4,1,3,1,3,3,1,5,1,5,5,5,1,3,1,2,1,4,5,4,4,1,3,3,1,4,1,2,1,3,2,1,5,5,3,3,1,3,5,1,5,3,5,3,1,1,1,1,4,4,3,5,5,1,1,2,2,5,5,3,2,5,2,3,4,4,1,1,2,2,4,3,5,5,1,1,5,4,3,1,3,1,2,4,4,4,4,1,4,3,4,1,3,5,5,5,1,3,5,4,3,1,3,5,4,4,3,4,2,1,1,3,1,1,2,4,1,4,1,1,1,5,5,1,3,4,1,1,5,4,4,2,2,1,3,4,4,2,2,2,3";

}