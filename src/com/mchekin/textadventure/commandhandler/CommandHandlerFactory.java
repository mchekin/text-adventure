package com.mchekin.textadventure.commandhandler;

import java.util.Locale;

public class CommandHandlerFactory {
    public CommandHandler build(String action) {

        return switch (action.trim().toLowerCase(Locale.ROOT)) {
            case "quit" -> new QuitGameCommandHandler();
            case "say" -> new SayCommandHandler();
            default -> new UnknownCommandHandler();
        };
    }
}
