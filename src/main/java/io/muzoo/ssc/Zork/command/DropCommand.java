package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;
import io.muzoo.ssc.Zork.item.Item;

public class DropCommand extends Command {

    private Game game;
    public DropCommand(Game game) {
        super("Drop the item player has", 1);
        this.game = game;
    }

    @Override
    protected void run(String args) {
        if(game.player.hasItem()){
            if(args.equals("item")){                //cmd : drop item
                Item item = game.player.dropItem();
                System.out.println("You dropped " + item.getItemName());
            }
            else if(args.equals(game.player.getItem().getItemName())){     // cmd : drop Sword and player has Sword
                Item item = game.player.dropItem();
                System.out.println("You dropped " + item.getItemName());
            }
            else{
                System.out.println("You don't have '"+args+"' to drop");   // Player doesn't have the specified item to drop
            }
        }else{
            System.out.println("You have no item to drop");    //Player doesn't have any item to drop
        }
    }
}
