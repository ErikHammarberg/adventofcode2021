package com.xmas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Day14AgainTest {

    Day14Again sut = new Day14Again();

    @Test
    public void oneEx() {
        var result = sut.two(example, 10);
        assertEquals(1588, result);
    }

    @Test
    public void one() {
        var result = sut.two(input, 10);
        System.out.println(result);
        assertEquals(4244, result);
    }

    @Test
    public void twoExample() {
        var result = sut.two(example, 40);
        System.out.println(result);
        assertEquals(2188189693529l, result);
    }

    @Test
    public void two() {
        var result = sut.two(input, 40);
        System.out.println(result);
        assertTrue(4807056953867l > result);
    }

//    @Test
//    public void one() {
//        var result = sut.one(input, 10);
//        System.out.println(result);
//        assertEquals(4244, result);
//    }
//
//    @Test
//    public void oneExTwoSol() {
//        var result = sut.two(example, 10);
//        assertEquals(1588, result);
//    }
//    @Test
//    public void twoEx() {
//        var result = sut.two(example, 40);
//        assertEquals(2188189693529l, result);
//    }

    @Test
    public void twoOneR() {
        var result = sut.two(example, 1);
    }

    String example = """
        NNCB
                
        CH -> B
        HH -> N
        CB -> H
        NH -> C
        HB -> C
        HC -> B
        HN -> C
        NN -> C
        BH -> H
        NC -> B
        NB -> B
        BN -> B
        BB -> N
        BC -> B
        CC -> N
        CN -> C""";

    String input = """
        HBHVVNPCNFPSVKBPPCBH
                
        HV -> B
        KS -> F
        NH -> P
        OP -> K
        OV -> C
        HN -> O
        FF -> K
        CP -> O
        NV -> F
        VB -> C
        KC -> F
        CS -> H
        VC -> F
        HF -> V
        NK -> H
        CF -> O
        HH -> P
        FP -> O
        OH -> K
        NN -> C
        VK -> V
        FB -> F
        VP -> N
        FC -> P
        SV -> F
        NO -> C
        VN -> S
        CH -> N
        FN -> N
        FV -> P
        CN -> H
        PS -> S
        VF -> K
        BN -> S
        FK -> C
        BB -> H
        VO -> P
        KN -> N
        ON -> C
        BO -> S
        VS -> O
        PK -> C
        SK -> P
        KF -> K
        CK -> O
        PB -> H
        PF -> O
        KB -> V
        CC -> K
        OK -> B
        CV -> P
        PO -> O
        SH -> O
        NP -> F
        CO -> F
        SS -> P
        FO -> K
        NS -> O
        PN -> H
        PV -> V
        KP -> C
        BK -> B
        BP -> F
        NB -> C
        OF -> O
        OC -> O
        HO -> C
        SC -> K
        HC -> C
        HS -> B
        KH -> N
        FS -> N
        PH -> O
        PC -> V
        BS -> O
        KO -> F
        SP -> K
        OB -> O
        SF -> K
        KV -> F
        NC -> B
        SO -> C
        CB -> S
        VH -> V
        FH -> F
        SN -> V
        SB -> P
        PP -> B
        BF -> K
        HB -> O
        OO -> V
        HP -> H
        KK -> O
        BV -> K
        BH -> B
        HK -> H
        BC -> C
        VV -> S
        OS -> F
        NF -> B""";
}