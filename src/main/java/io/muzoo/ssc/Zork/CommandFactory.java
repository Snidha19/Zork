package io.muzoo.ssc.Zork;

import io.muzoo.ssc.Zork.command.Command;
import io.muzoo.ssc.Zork.command.ExitCommand;

import java.util.*;

public class CommandFactory {

    private static Map<String, Command> commandMap = new HashMap<String, Command>();

    public void generateCommands(){
        commandMap.put("exit", new ExitCommand());
    }

    public Command getCommand(String cmd){
        return commandMap.get(cmd);
    }



}
