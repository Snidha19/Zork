package io.muzoo.ssc.Zork;

import io.muzoo.ssc.Zork.command.Command;
import java.util.*;

public class Game {

    private GameOutput output = new GameOutput();
    private CommandFactory commands = new CommandFactory();

    public Game(){
        commands.generateCommands();
    }

    public void run(){
        while(true){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            Command command = commands.getCommand(s.split(" ")[0]);
            if (command == null){
                output.println("No command given");
            }
            else{
                command.execute(s);
            }
        }
    }

    public void exit(){
        output.println("Game exit");
        System.exit(0);
    }
}
