package com.mchekin.textadventure.commandhandler;

import com.mchekin.textadventure.command.Command;

public class SayCommandHandler implements CommandHandler {

    @Override
    public String execute(Command command) {
        return String.join(" ", command.getParameters());
    }
}
