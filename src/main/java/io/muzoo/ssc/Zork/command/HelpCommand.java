package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.CommandFactory;

public class HelpCommand extends Command{

    public HelpCommand(){
        super("Show all the commands", 0);
    }

    @Override
    protected void run(String args) {
        System.out.println("List of All Commands");
        System.out.println("---------------------");
        for(String command : CommandFactory.commandMap.keySet()){
            System.out.println( command + " : " +CommandFactory.getCommand(command).description);
        }
        System.out.println("---------------------");
    }
}
