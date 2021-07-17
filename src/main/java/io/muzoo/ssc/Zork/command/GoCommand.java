package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;
import io.muzoo.ssc.Zork.rooms.Room;

public class GoCommand extends Command{

    private Game game;

    public GoCommand(Game game) {
        super("Go to the adjacent room", 1);
        this.game = game;
    }


    @Override
    protected void run(String args) {
        System.out.println("--------------------");
        if(!args.equalsIgnoreCase("north") && !args.equalsIgnoreCase("south") &&
                !args.equalsIgnoreCase("east") && !args.equalsIgnoreCase("west")){
            System.out.println("Unknown direction, please use (north/south/east/west)");
        }
        else{
            Room room = game.currentRoom;
            if(args.equalsIgnoreCase("north") && room.hasNorthDoor()){
                game.currentRoom = room.getNextRoom("north");
                game.player.increaseHp();
                System.out.println("Now You are in the " + game.currentRoom.getRoomName());
            }
            else if(args.equalsIgnoreCase("south") && room.hasSouthDoor()){
                game.currentRoom = room.getNextRoom("south");
                game.player.increaseHp();
                System.out.println("Now You are in the " + game.currentRoom.getRoomName());
            }
            else if(args.equalsIgnoreCase("west") && room.hasWestDoor()){
                game.currentRoom = room.getNextRoom("west");
                game.player.increaseHp();
                System.out.println("Now You are in the " + game.currentRoom.getRoomName());
            }
            else if(args.equalsIgnoreCase("east") && room.hasEastDoor()){
                game.currentRoom = room.getNextRoom("east");
                game.player.increaseHp();
                System.out.println("Now You are in the " + game.currentRoom.getRoomName());
            }
            else {
                System.out.println("There is no door on the specified direction");
            }
        }

    }
}
