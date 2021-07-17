package io.muzoo.ssc.Zork.command;

public abstract class Command {

    int numArgs;
    String description;
    String args;

    public Command(String description, int numArgs){
        this.description = description;
        this.numArgs = numArgs;
    }

    protected abstract void run(String args);


    public void execute(String command,String[] cmds){
        if (numArgs == 1){
            if (cmds.length > 2){
                args = command.split(" ")[2];
                run(args);
            }else{
                if (cmds[0].equals("attack") && cmds[1].equals("with")) {
                    System.out.println("Incorrect usage of Attack command");
                }else {
                    if(!cmds[0].equals("attack")) {
                        args = command.split(" ")[1];
                        run(args);
                    }
                }
            }
        }else{
            args=null;
            run(args);
        }

    }


}
