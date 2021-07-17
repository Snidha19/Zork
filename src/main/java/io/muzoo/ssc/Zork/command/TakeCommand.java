package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;
import io.muzoo.ssc.Zork.item.Item;
import io.muzoo.ssc.Zork.rooms.Room;

public class TakeCommand extends Command {

    private Game game;
    public TakeCommand(Game game) {
        super("picks up an item in the room", 1);
        this.game = game;
    }

    @Override
    protected void run(String args) {
        Room room = game.currentRoom;
        if(room.hasItem()){                // Item exists in room
            Item item = room.getItem();
            if(!game.player.hasItem()){    // player doesn't have any item
                System.out.println("You took "+ item.getItemName());
                room.removeItem();
            }
            else{
                int currItemVal = game.player.getItem().getPowerVal();
                int newItemVal = item.getPowerVal();
                if(newItemVal > currItemVal){   // if new item power val is greater than current item, take new val
                    game.player.item = item;
                    System.out.println("Now You have " + game.player.getItem().getItemName());
                    room.removeItem();
                }
            }
        }else{     // No items in the room
            System.out.println("No items in the room.");
        }
    }
}
