package Prototype;

/**
 * Created by Richard Harrington on 8/25/2014.
 */
public class Demon extends Monster{
    private int health, speed;

    public Demon(int health, int speed){
        this.health = health;
        this.speed = speed;
    }

    @Override
    public Monster clone() {
        return new Demon(health, speed);
    }
}
