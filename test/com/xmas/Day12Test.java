package com.xmas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day12Test {

    Day12 sut = new Day12();

    @Test
    void oneEx() {
        var result = sut.one(example);
        assertEquals(10, result);
    }

    @Test
    void one2Ex() {
        var result = sut.one(example2);
        assertEquals(19, result);
    }

    @Test
    void one() {
        var result = sut.one(input);
        System.out.println(result);
        assertEquals(4304, result);
    }

    @Test
    void twoEx() {
        var result = sut.two(example);
        assertEquals(36, result);
    }

    @Test
    void two2Ex() {
        var result = sut.two(example2);
        assertEquals(103, result);
    }

    @Test
    void two() {
        var result = sut.two(input);
        System.out.println(result);
        assertEquals(118242, result);
    }

    String example = """
            start-A
            start-b
            A-c
            A-b
            b-d
            A-end
            b-end""";

    String example2 = """
            dc-end
            HN-start
            start-kj
            dc-start
            dc-HN
            LN-dc
            HN-end
            kj-sa
            kj-HN
            kj-dc""";

    String input = """
            start-YA
            ps-yq
            zt-mu
            JS-yi
            yq-VJ
            QT-ps
            start-yq
            YA-yi
            start-nf
            nf-YA
            nf-JS
            JS-ez
            yq-JS
            ps-JS
            ps-yi
            yq-nf
            QT-yi
            end-QT
            nf-yi
            zt-QT
            end-ez
            yq-YA
            end-JS""";
}