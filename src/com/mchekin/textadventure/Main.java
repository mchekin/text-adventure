package com.mchekin.textadventure;

import com.mchekin.textadventure.command.Command;
import com.mchekin.textadventure.commandhandler.CommandHandler;
import com.mchekin.textadventure.commandhandler.CommandHandlerFactory;
import com.mchekin.textadventure.commandhandler.QuitGameCommandHandler;
import com.mchekin.textadventure.input.InputParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                System.out.print("> ");

                List<String> argumentList = new InputParser().parse(in.readLine());

                Command command = new Command(
                        argumentList.subList(1, argumentList.size())
                );

                CommandHandler commandHandler = new CommandHandlerFactory().build(argumentList.get(0));

                String message = commandHandler.execute(command);

                System.out.println(message);

                if (commandHandler instanceof QuitGameCommandHandler) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
