package com.mchekin.textadventure.commandhandler;

import com.mchekin.textadventure.command.Command;

public class QuitGameCommandHandler implements CommandHandler {

    @Override
    public String execute(Command command) {
        return "Bye!";
    }
}
