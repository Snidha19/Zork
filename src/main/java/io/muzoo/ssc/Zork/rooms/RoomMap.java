package io.muzoo.ssc.Zork.rooms;

import io.muzoo.ssc.Zork.Monster;
import io.muzoo.ssc.Zork.item.Axe;
import io.muzoo.ssc.Zork.item.Knives;
import io.muzoo.ssc.Zork.item.Sword;

public class RoomMap {
    Room cave = new Room("cave", true,false, true, false, new Axe(), new Monster(), 2);
    Room temple = new Room("temple", true, true,true,false, null, new Monster(), 0);
    Room waterfall = new Room("waterfall", false,true,false,true, new Axe(), new Monster(), 1);
    Room forest = new Room("forest",false,true,true,true, new Sword(), new Monster(), 3);
    Room start = new Room("start",false,true,true,false, new Knives(),null , 1);
    Room openField = new Room("openField" ,true,true,false,true, new Sword(), new Monster(), 2);
    Room currentRoom = start;
    int totalMonsters;

    public RoomMap(){
        cave.setNextRooms(temple,null,openField,null);
        temple.setNextRooms(forest,waterfall,openField,null);
        waterfall.setNextRooms(null,forest,null,temple);
        forest.setNextRooms(null,start,temple,waterfall);
        start.setNextRooms(null,openField,forest,null);
        openField.setNextRooms(cave,start,null,temple);

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int getNumMonsters(){
        totalMonsters = cave.getNumMonster() + temple.getNumMonster()+ waterfall.getNumMonster()
                + forest.getNumMonster() + start.getNumMonster() + openField.getNumMonster();
        return totalMonsters;
    }


    public void decreaseNumMonster(){
        totalMonsters--;
    }

}
