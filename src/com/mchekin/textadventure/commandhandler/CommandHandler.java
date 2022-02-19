package com.mchekin.textadventure.commandhandler;

import com.mchekin.textadventure.command.Command;

public interface CommandHandler {
    String execute(Command command);
}
