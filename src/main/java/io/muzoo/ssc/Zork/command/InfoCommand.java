package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;

public class InfoCommand extends Command{

    private Game game;
    public InfoCommand(Game game) {
        super("Print player stats and room information", 0);
        this.game = game;

    }

    @Override
    protected void run(String args) {

    }
}
