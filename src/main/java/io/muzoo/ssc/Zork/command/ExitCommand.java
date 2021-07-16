package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;

public class ExitCommand extends Command {

    public ExitCommand(){
        super("Exit the game", 0);
    }


    public void run(String args) {
        System.out.println("Game exit");
        System.exit(0);
    }
}
