package io.muzoo.ssc.Zork;

import io.muzoo.ssc.Zork.command.Command;
import io.muzoo.ssc.Zork.item.Item;
import io.muzoo.ssc.Zork.rooms.Room;
import io.muzoo.ssc.Zork.rooms.RoomMap;

import java.util.*;

public class Game {

    public GameOutput output = new GameOutput();
    public CommandFactory commands = new CommandFactory();
    public RoomMap map = new RoomMap();
    public Room currentRoom;
    public Player player;

    public Game(){
        start();
        commands.generateCommands(this);
        currentRoom = map.getCurrentRoom();
        System.out.println(currentRoom.getRoomName());
        System.out.println(currentRoom.getItem().getItemName());
        System.out.println(currentRoom.hasSouthDoor());
        Item item = currentRoom.getItem();
        player = new Player(item);
        System.out.println(player.getItem());
    }

    public void start(){
        output.println(" Zork Game");
        output.println(" Type \"help\" to print all the commands");
        output.println(" Type \"exit\" to exit the game");
    }

    public void run(){
        while(true){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            String[] cmds = s.split(" ");
            Command command = commands.getCommand(s.split(" ")[0]);
            if (command == null){
                output.println("No command given");
            }
            else{
                command.execute(s,cmds);
            }
        }
    }

    public void exit(){
        output.println("Game exit");
        System.exit(0);
    }
}
