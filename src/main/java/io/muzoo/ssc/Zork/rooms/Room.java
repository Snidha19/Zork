package io.muzoo.ssc.Zork.rooms;

import io.muzoo.ssc.Zork.Monster;
import io.muzoo.ssc.Zork.item.Item;

public class Room {

    private String roomName;
    private Item item;
    private Monster monster;
    boolean[] doors ={false,false,false,false}; // N,S,E,W   true: door, false: no door

    public Room(String name, boolean N, boolean S, boolean E, boolean W){
        this.roomName = name;
        this.doors = new boolean[] {N,S,E,W};
        this.item = null;
        this.monster = null;
    }

    public boolean monsterExist(){ return this.monster!=null;}
    public boolean itemExist(){ return this.item!=null;}
    public boolean hasNorthDoor(){return this.doors[0];}
    public boolean hasSouthDoor(){return this.doors[1];}
    public boolean hasEastDoor(){return this.doors[2];}
    public boolean hasWestDoor(){return this.doors[3];}

}
