package io.muzoo.ssc.Zork;

import io.muzoo.ssc.Zork.item.Item;

public class Player {
    public int maxHp;
    private int attackPower;
    private int hp;
    public Item item;
    public static final int increaseAP = 10;
    public static final int increaseHP = 20;

    public Player(Item weapon){
        this.maxHp = 100;
        this.attackPower = 200;
        this.hp = maxHp;
        item = weapon;
    }

    public Player(){
        this.maxHp = maxHp;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public int getMaxHp(){ return maxHp;}
    public int getHp(){ return hp;}
    public int getAttackPower(){return attackPower;}

    public void increaseHp(){
        hp+=increaseHP;
        hp = Math.min(hp, maxHp);
    }

    public void decreaseHp(int decrement){
        hp+=decrement;
        hp = Math.max(hp, 0);
    }

    public void increaseAP(){
        attackPower+=increaseAP;
    }

    public boolean isAlive(){
        return hp>0;
    }

    public boolean hasItem(){
        return item!=null;
    }

    public Item getItem(){
        return item;
    }

    public Item dropItem(){
        Item dropped = getItem();
        item = null;
        return dropped;
    }


}
