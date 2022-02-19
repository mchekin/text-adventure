package com.mchekin.textadventure.input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class InputParser {
    public List<String> parse(String rawInput) {
        String[] arguments = rawInput.split("\\W+");

        return new ArrayList<>(Arrays.asList(arguments));
    }
}
