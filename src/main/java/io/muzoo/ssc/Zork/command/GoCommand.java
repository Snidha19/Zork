package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;

public class GoCommand extends Command{

    private Game game;
    public GoCommand(Game game) {
        super("Go to the adjacent room", 1);
        this.game = game;
    }


    @Override
    protected void run(String args) {
        System.out.println("go to north");
    }
}
