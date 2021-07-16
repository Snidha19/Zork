package io.muzoo.ssc.Zork.item;

public class Knives extends Item{

    private String name="Knives";
    private int powerVal = 20;

    public Knives(){
        super.initialize(name,powerVal);
    }
}
