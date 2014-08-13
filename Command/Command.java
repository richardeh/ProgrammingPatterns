package Command;

import framework.Actor;

/**
 * Created by Richard Harrington on 8/13/2014.
 */
public interface Command {
    public void execute();
    public void undo();
}
