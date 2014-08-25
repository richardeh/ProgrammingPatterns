package Prototype;

/**
 * Created by Richard Harrington on 8/25/2014.
 */
public class Spawner {
    Monster monster;
    public Spawner(Monster monster){
        this.monster = monster;
    }

    public Monster spawnMonster(){
        return monster.clone();
    }
}
