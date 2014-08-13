package framework;

import Command.MoveUnitCommand;

/**
 * Created by Richard Harrington on 8/13/2014.
 */
public class Actor {
    private static int x;
    private static int y;

    public MoveUnitCommand moveToOrigin;
    public MoveUnitCommand moveUp, moveDown, moveRight, moveLeft;

    public Actor(){
        moveToOrigin = new MoveUnitCommand();
        moveToOrigin.MoveUnitCommand(0,0);

        moveUp = new MoveUnitCommand();
        moveUp.MoveUnitCommand(this.x-1,this.y);

        moveDown = new MoveUnitCommand();
        moveDown.MoveUnitCommand(this.x+1,this.y);

        moveRight = new MoveUnitCommand();
        moveRight.MoveUnitCommand(this.x,this.y+1);

        moveLeft = new MoveUnitCommand();
        moveLeft.MoveUnitCommand(this.x,this.y-1);

    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Actor.y = y;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Actor.x = x;
    }

}
