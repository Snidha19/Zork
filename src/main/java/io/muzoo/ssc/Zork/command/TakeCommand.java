package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;

public class TakeCommand extends Command {

    private Game game;
    public TakeCommand(Game game) {
        super("picks up an item in the room", 1);
        this.game = game;
    }

    @Override
    protected void run(String args) {

    }
}
