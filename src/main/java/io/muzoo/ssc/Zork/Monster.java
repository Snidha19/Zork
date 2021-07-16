package io.muzoo.ssc.Zork;

public class Monster {
    private int maxHp = 200;
    private int hp = maxHp;
    private int attackPower = 20;

    public int getMaxHp(){ return maxHp;}
    public int getHp() { return hp; }
    public int getAttackPower(){return attackPower;}

    public void increaseHp(int increment){
        hp+=increment;
        hp = Math.min(hp, maxHp);
    }

    public void decreaseHp(int decrement){
        hp+=decrement;
        hp = Math.max(hp, 0);
    }

    public boolean isAlive(){
        return hp>0;
    }
}
