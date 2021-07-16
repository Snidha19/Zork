package io.muzoo.ssc.Zork.command;

import io.muzoo.ssc.Zork.Game;

public abstract class Command {

    int numArgs;
    String description;
    String args;

    public Command(String description, int numArgs){
        this.description = description;
        this.numArgs = numArgs;
    }

//    String getCommand() {
//        return null;
//    }

    protected abstract void execute();

    public void execute(String command){
        if (numArgs == 1){
            if (command.length() > 2){
                args = command.split(" ")[2];
            }else{
                args = command.split(" ")[1];
            }
        }else{
            args="";
        }
        execute();
    }


}
