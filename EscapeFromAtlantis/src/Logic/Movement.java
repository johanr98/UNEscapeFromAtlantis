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

    public void moveVillage(Villager village, int posX, int posY) {
        int x = Math.abs(posX - village.getPositionX());
        int y = Math.abs(posY - village.getPositionY());

        if (x > 1 || y > 1 || (village.getPositionX() == x || village.getPositionY() == y) || (x == 0 || y == 0)) {
            System.out.println("Ingrese una opción valida!!"
                    + " pierde turno");
        } else {

            village.setTilePosition(posX, posY);
        }
    }
}
