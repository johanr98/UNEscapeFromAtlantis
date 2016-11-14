/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;
import UI.*;
/**
 *
 * @author macas
 */
public class Movement {

    private String direction;
    private int numberOfTiles;
    private GraphicsUI consola;

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

    public static void moveVillage(Villager village, int posX, int posY) {
        int x = Math.abs(posX - village.getPositionX());
        int y = Math.abs(posY - village.getPositionY());
        if (x > 1 || y > 1 || ((x == 0 && y == 0))) {
            System.out.println("Ingrese una opción valida!!"
                    + " pierde turno");

        } else {

            village.setTilePosition(posX, posY);
        }
    }
    
    public void moveVillagers(Villager villager, int x, int y) {
        villager.setTilePosition(x, y);
    }

    /**
     * Determina el final del juego
     *
     * @param villager - revisa que el cosito este es una casilla de salvación
     * @return retorna un entero, que sale del loop del juego
     */
    

    public void moveSeaSerpent() {
        Animal seaSerpent = consola.selectAnimal();
        if (seaSerpent.getName().equals("Sea Serpent")) {
            seaSerpent.setPosition(consola.selectTile().getPosition());
        } else {
            consola.printString("Escoja una Serpiente Marina!");
            moveSeaSerpent();
        }
    }

    public void moveShark() {
        Animal shark = consola.selectAnimal();
        if (shark.getName().equals("Shark")) {
            shark.setPosition(consola.selectTile().getPosition());
        } else {
            consola.printString("Escoja un Tiburón!");
            moveShark();
        }
    }

    public void moveWhale() {
        Animal whale = consola.selectAnimal();
        if (whale.getName().equals("Whale")) {
            whale.setPosition(consola.selectTile().getPosition());
        } else {
            consola.printString("Escoje una Ballena!");
            moveWhale();
        }
    }

}
