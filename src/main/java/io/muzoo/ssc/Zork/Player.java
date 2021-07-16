package io.muzoo.ssc.Zork;

import io.muzoo.ssc.Zork.item.Item;

public class Player {
    private int maxHp = 100;
    private int attackPower = 15;
    private int hp;
    public Item item;
    public static final int increaseAP = 10;
    public static final int increaseHP = 20;


    public Player(int maxHp, int attackPower, int hp){
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

}