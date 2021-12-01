package com.xmas;

import java.util.Arrays;
import java.util.List;

public class Util {

    public static List<String> splitInput(String input) {
        return Arrays.stream(input.split("\\n")).toList();
    }

}
