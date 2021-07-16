package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;

public class QuitCommand extends Command{

    private Game game;
    public QuitCommand(Game game) {
        super("Quit the game", 0);
        this.game = game;
    }

    @Override
    protected void run(String args) {

    }
}
