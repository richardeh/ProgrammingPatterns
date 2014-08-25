package Prototype;

/**
 * Created by Richard Harrington on 8/25/2014.
 */
public class Ghost extends Monster {
    private int health,speed;

    public Ghost(int health, int speed){
        this.health = health;
        this.speed = speed;
    }
    @Override
    public Monster clone() {
        return new Ghost(health,speed);
    }
}
