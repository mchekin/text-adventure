package com.mchekin.textadventure.command;

import java.util.List;

public class Command {
    private final List<String> parameters;

    public Command(List<String> parameters) {
        this.parameters = parameters;
    }

    public List<String> getParameters() {
        return parameters;
    }
}
