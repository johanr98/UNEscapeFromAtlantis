/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.*;
import Data.*;
import java.io.Serializable;

/**
 *
 * @author johans
 */
public class GameMaster implements Serializable {

    private ConsoleUI consola;
    private Board map;
    private MapManager mapManager;

    public GameMaster(ConsoleUI consola, Board board) {
        this.consola = consola;

        map = board;
        mapManager = new MapManager(map);

        start();
    }

    public void start() {
        consola.menu();
        outerloop:
        while (true) {

            switch (consola.returnInt()) {

                case 1:
                    play();
                    break outerloop;
                case 0:
                    System.exit(0);
                    break;
                default:
                    consola.printString("Ingresa de nuevo el valor");
                    break;

            }
        }
    }

    public void play() {

    }

    public void moveVillagers(Villager villager, int x, int y) {
        villager.setTilePosition(x, y);
    }

    /**
     * Agrega las fichas del jugador
     */
    public int endGame(Villager villager) {
        if ((villager.getPositionX() == 0 && villager.getPositionY() == 0)
                || ((villager.getPositionX() == 4 && villager.getPositionY() == 0))) {
            System.out.println("Fin del juego.");
            System.out.println();
            return 1;
        } else {
            return 0;
        }
    }

    public void moveSeaSerpent() {
        Animal seaSerpent = consola.selectAnimal();
        if (seaSerpent.getName().equals("Sea Serpent")) {
            seaSerpent.setPosition(consola.selectTile().getPosition());
        } else {
            consola.printString("Escoja una Serpiente Marina!");
            moveSeaSerpent();
        }

    }

    public void moveBoat() {
        if (consola.selectBoat().getName().equals("Sea Serpent")) {
            consola.selectAnimal().setPosition(consola.selectTile().getPosition());
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

    public void eliminateWhale() {
        Animal whale = consola.selectAnimal();
        if (whale.getName().equals("Whale")) {
            whale = null;
        } else {
            consola.printString("Escoje una Ballena!");
            eliminateWhale();
        }
    }

    public void eliminateShark() {

        Animal shark = consola.selectAnimal();
        if (shark.getName().equals("Shark")) {
            shark = null;
        } else {
            consola.printString("Escoje un Tiburòn!");
            eliminateShark();
        }
    }
}
