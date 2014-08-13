package Command;

import framework.Actor;

/**
 * Created by Richard Harrington on 8/13/2014.
 * An example of the Command programming pattern
 */
public class MoveUnitCommand implements Command {

    private static int previousX, previousY;
    private static int x,y;

    public void MoveUnitCommand(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute() {
        previousX = Actor.getX();
        previousY = Actor.getY();

        Actor.setX(x);
        Actor.setY(y);
    }

    @Override
    public void undo() {
        Actor.setX(previousX);
        Actor.setY(previousY);
    }
}
