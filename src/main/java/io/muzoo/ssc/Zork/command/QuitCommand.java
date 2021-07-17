package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;
import io.muzoo.ssc.Zork.Player;

public class QuitCommand extends Command{

    private Game game;
    public QuitCommand(Game game) {
        super("Quit the game", 0);
        this.game = game;
    }

    @Override
    protected void run(String args) {
        System.out.println("Quit current game");
        System.out.println("Start a new game");
        game.start();
    }
}
