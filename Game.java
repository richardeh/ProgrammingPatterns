import Command.MoveUnitCommand;
import framework.Actor;

import java.util.ArrayList;

/**
 * Created by Richard Harrington on 8/13/2014.
 */
public class Game {
    private static Actor actor;

    public static void main(String[] args){
        actor = new Actor();
        ArrayList<Actor> actors = new ArrayList<Actor>();
        actors.add(actor);

        // Examples of executing commands
        actor.moveLeft.execute();
        actor.moveDown.execute();
        actor.moveRight.execute();
        actor.moveUp.execute();
        MoveUnitCommand moveDiagonally = new MoveUnitCommand();

        for(Actor a:actors){
            moveDiagonally.MoveUnitCommand(a.getX()+1,a.getY()+1);
            moveDiagonally.execute();
        }

    }
}
