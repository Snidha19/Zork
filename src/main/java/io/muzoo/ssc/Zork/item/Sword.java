package io.muzoo.ssc.Zork.item;

public class Sword extends Item{

    private String name="Sword";
    private int powerVal = 30;

    public Sword(){
        super.initialize(name,powerVal);
    }
}
