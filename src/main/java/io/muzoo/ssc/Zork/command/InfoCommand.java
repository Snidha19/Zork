package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;
import io.muzoo.ssc.Zork.Player;
import io.muzoo.ssc.Zork.rooms.Room;

public class InfoCommand extends Command{

    private Game game;
    public InfoCommand(Game game) {
        super("Print player stats and room information", 0);
        this.game = game;

    }

    @Override
    protected void run(String args) {

        //Player Stats
        Player player = game.player;
        System.out.println("--------------------");
        System.out.println("Player Stats");
        System.out.println("HP: " + player.getHp() + "/" + player.getMaxHp());
        System.out.println("Attack Power: " + player.getAttackPower());

        if(player.hasItem()){
            System.out.println("You have " + player.getItem().getItemName());
        }else{
            System.out.println("You have no item");
        }

        System.out.println("\nRoom Info ");

        //Room Information
        Room room = game.currentRoom;
        System.out.println("Room name :" + room.getRoomName());
        if (room.getItem() != null){
            System.out.printf("There is %s in the room\n", room.getItem().getItemName());
        }else{
            System.out.println("There is no item in the room");
        }
        if(room.getMonster() != null){
            System.out.printf("There are %s monsters in this room\n", room.getNumMonster());
        }else{
            System.out.println("There is no monster in the room");
        }
        //Room doors info
        if(room.hasEastDoor()){
            System.out.println("There is a door in the East");
        }
        if(room.hasNorthDoor()){
            System.out.println("There is a door in the North");
        }
        if(room.hasSouthDoor()){
            System.out.println("There is a door in the South");
        }
        if(room.hasWestDoor()){
            System.out.println("There is a door in the West");
        }

        System.out.println("--------------------");
    }
}
