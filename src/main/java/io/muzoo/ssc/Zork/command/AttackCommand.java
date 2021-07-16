package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;
import io.muzoo.ssc.Zork.Monster;
import io.muzoo.ssc.Zork.rooms.Room;

import java.util.Scanner;

public class AttackCommand extends Command{

    Game game;

    public AttackCommand(Game game) {
        super("Attack a monster in the room", 1);
        this.game = game;
    }

    @Override
    protected void run(String args) {
        Room room = game.currentRoom;
        if(room.monsterExist()){
            System.out.println(room.getMonster().getClass());
            boolean result = attack(room.getMonster(), args);
            System.out.println("from attack : "+ result);
            if(result){
                game.map.decreaseNumMonster();
                room.removeMonster();
                game.player.increaseAP();
                if(game.map.getNumMonsters() <= 0){
                    System.out.println("All monsters killed!! You win\n");
                    game.start();
                }
            }
            else{
                System.out.println("Monster killed you!! You died\n");
                game.start();
            }
        }else{
            game.output.println("No monsters to fight");
        }

    }

    public boolean attack(Monster monster, String item){
        boolean attack = true;
            if(game.player.isAlive()){
                System.out.println("You can attack the monster");
                int attackPower = 0;
                System.out.println(game.player.hasItem());
                if(game.player.hasItem()){
                    String itemN = game.player.getItem().getItemName();
                    System.out.println("You have " + itemN);
                    if(!itemN.equals(item)){
                        System.out.println("You don't have '"+item+"' So you can use '"+itemN+"'");
                    }
                    attackPower = game.player.getAttackPower() + game.player.getItem().getPowerVal();
                }
                else{
                    attackPower = game.player.getAttackPower();
                }
                System.out.println(attackPower);
                monster.decreaseHp(attackPower);
                attack=!attack;
            }

            if(monster.isAlive()){
                int attackPower = monster.getAttackPower();
                game.player.decreaseHp(attackPower);
                System.out.println("player killed");
                attack=!attack;
                return false;
            }else{
                game.output.println("You killed the monster");
                return true;
            }
    }
}
