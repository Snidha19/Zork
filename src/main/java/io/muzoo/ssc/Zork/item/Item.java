package io.muzoo.ssc.Zork.item;

public abstract class Item {

    private String itemName;
    private int powerVal;

    public void initialize(String itemName, int powerVal){
        this.itemName = itemName;
        this.powerVal = powerVal;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPowerVal() {
        return powerVal;
    }
}
