package framework;

import com.sun.prism.Texture;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Richard Harrington on 8/13/2014.
 */

public class World {

    ArrayList<ArrayList<Terrain>> tiles;

    int HEIGHT, WIDTH;
    Texture GRASS_TEXTURE;
    Terrain grass = new Terrain(1,false,GRASS_TEXTURE);

    Texture HILL_TEXTURE;
    Terrain hill = new Terrain(2,false,HILL_TEXTURE);

    Texture RIVER_TEXTURE;
    Terrain river = new Terrain(3,true,RIVER_TEXTURE);

    public boolean isWater(int x, int y){
        return tiles.get(x).get(y).isWater();
    }

    public void generateTerrain() {
        Random rand = new Random();
        ArrayList<Terrain> row = null;
        for (int x = 0; x < HEIGHT; x++) {
            for (int y = 0; y < WIDTH; y++) {
                if( rand.nextInt(10)== 0){
                    row.add(hill);
                } else{
                    row.add(grass);
                }
            }
            tiles.add(row);
        }
        int x = rand.nextInt(HEIGHT);
        for(int y=0;y<WIDTH;y++)
            tiles.get(x).set(y,river);
    }

    public Terrain getTile(int x, int y){
        return tiles.get(x).get(y);
    }
}
