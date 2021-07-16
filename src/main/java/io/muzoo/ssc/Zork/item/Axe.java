package io.muzoo.ssc.Zork.item;

public class Axe extends Item{

    private String name="Axe";
    private int powerVal = 10;

    public Axe(){
        super.initialize(name,powerVal);
    }
}
