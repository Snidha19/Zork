package io.muzoo.ssc.Zork.rooms;

import io.muzoo.ssc.Zork.Monster;
import io.muzoo.ssc.Zork.item.Item;

import java.util.HashMap;
import java.util.Map;

public class Room {

    private String roomName;
    private Item item;
    private Monster monster;
    private int numMonster;
    boolean[] doors; // N,S,E,W   true: door, false: no door
    public Map<String,Room> nextRooms = new HashMap<>();

    public Room(String name, boolean N, boolean S, boolean E, boolean W, Item item, Monster monster, int num){
        this.roomName = name;
        this.doors = new boolean[] {N,S,E,W};
        this.item = item;
        this.monster = monster;
        this.numMonster =  num;
    }

    public boolean monsterExist(){ return this.monster!=null;}
    public boolean hasItem(){ return this.item!=null;}

    public Monster getMonster() { return this.monster; }
    public void removeMonster() { monster = null;}
    public Item getItem() { return this.item; }
    public void removeItem() { item = null;}

    public boolean hasNorthDoor(){return this.doors[0];}
    public boolean hasSouthDoor(){return this.doors[1];}
    public boolean hasEastDoor(){return this.doors[2];}
    public boolean hasWestDoor(){return this.doors[3];}

    public int getNumMonster() {
        return numMonster;
    }

    public void reduceMonsterNum(){
        numMonster--;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setNextRooms(Room N, Room S, Room E, Room W){
            nextRooms.put("north", N);
            nextRooms.put("south", S);
            nextRooms.put("east", E);
            nextRooms.put("west", W);
    }

    public Room getNextRoom(String direction){
        return nextRooms.get(direction);
    }
}
