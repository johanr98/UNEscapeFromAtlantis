/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import Data.*;
/**
 *
 * @author macas
 */
public class Movement {
    private String direction;
    private int numberOfTiles;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getNumberOfTiles() {
        return numberOfTiles;
    }

    public void setNumberOfTiles(int numberOfTiles) {
        this.numberOfTiles = numberOfTiles;
    }
    public void moveVillage (Villager village, int posX, int posY){
        village.setTilePosition(posX, posY);
    }
}
