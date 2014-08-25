package Prototype;

/**
 * Created by Richard Harrington on 8/25/2014.
 */
public class Sorcerer extends Monster {
    private int health, speed;

    public Sorcerer(int health, int speed){
        this.health = health;
        this.speed = speed;
    }
    @Override
    public Monster clone() {
        return new Sorcerer(health, speed);
    }
}
