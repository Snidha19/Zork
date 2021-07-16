package io.muzoo.ssc.Zork;

import io.muzoo.ssc.Zork.command.*;

import java.util.*;

public class CommandFactory {

    public static Map<String, Command> commandMap = new HashMap<String, Command>();

    public void generateCommands(Game game){
        commandMap.put("exit", new ExitCommand());
        commandMap.put("attack", new AttackCommand(game));
        commandMap.put("help", new HelpCommand());
        commandMap.put("info", new InfoCommand(game));
        commandMap.put("quit", new QuitCommand(game));
        commandMap.put("take", new TakeCommand(game));
        commandMap.put("go", new GoCommand(game));
        commandMap.put("drop", new DropCommand(game));

    }

    public static Command getCommand(String cmd){
        return commandMap.get(cmd);
    }

//    public HashMap<String,Command> getAllCommands(){
//        return this.commandMap;
//    }
}
