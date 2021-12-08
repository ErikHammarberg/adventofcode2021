package com.xmas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day8Test {

    Day8 sut = new Day8();

    @Test
    public void first() {
        var result = sut.one("acedgfb cdfbe gcdfa fbcad dab cefabd cdfgeb eafb cagedb ab | cdfeb fcadb cdfeb cdbaf");
    }

}