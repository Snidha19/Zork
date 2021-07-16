package io.muzoo.ssc.Zork.rooms;

public class RoomMap {
    Room cave = new Room("cave", true,false, true, false);
    Room temple = new Room("temple", true, true,false,false);
    Room waterfall = new Room("waterfall", false,true,false,true);
    Room forest = new Room("forest",false,false,true,true);
    Room start = new Room("start",false,true,true,false);
    Room openField = new Room("openField" ,true,true,true,true);

}
