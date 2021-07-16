package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;

public class DropCommand extends Command {

    private Game game;
    public DropCommand(Game game) {
        super("Drop the item player has", 1);
        this.game = game;
    }

    @Override
    protected void run(String args) {

    }
}
