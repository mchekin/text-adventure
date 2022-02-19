package com.mchekin.textadventure.commandhandler;

import com.mchekin.textadventure.command.Command;

public class UnknownCommandHandler implements CommandHandler {

    @Override
    public String execute(Command command) {
        return "Unknown command";
    }
}
