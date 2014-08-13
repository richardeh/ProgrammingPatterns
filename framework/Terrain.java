package framework;

import com.sun.prism.Texture;

import javax.xml.soap.Text;

/**
 * Created by Richard Harrington on 8/13/2014.
 */
public class Terrain {
    public enum Types {
        TERRAIN_GRASS,
        TERRAIN_HILL,
        TERRAIN_RIVER
    }
    private final int movementCost;
    private final boolean isWater;
    private final Texture texture;

    public Terrain(int movementCost, boolean isWater, Texture texture){
        this.movementCost = movementCost;
        this.isWater = isWater;
        this.texture = texture;
    }

    public int getMovementCost(){ return movementCost;}
    public boolean isWater(){ return isWater;}
    public Texture getTexture(){ return texture;}
}
