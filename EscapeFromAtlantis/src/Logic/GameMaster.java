/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.*;
import Data.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author johans
 */
public class GameMaster implements Serializable {

    // Atributos
    private ConsoleUI consola;
    private Board map;
    private MapManager mapManager;

    //Constructor GameMaster
    public GameMaster(ConsoleUI consola, Board map) {
        this.consola = consola;//
        this.map = map;
        mapManager = new MapManager(map);
        start();
    }

    public GameMaster() {

    }

    //Metodo para Iniciar o finalizar el Juego
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
                default:
                    consola.printString("Ingresa de nuevo el valor");
                    break;
            }
        }
    }// fin start

    public void inicializar() {
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < 4; i++) {
            consola.printString("Datos del jugador " + i);
            players.add(i, consola.initializePlayer());
        }
        for (Player i : players) {
            System.out.println(i);
        }
    }

    public void play() {

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

    public void moveSnake() {
        consola.selectAnimal();
        consola.selectTile();
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

        Animal shark = new Shark(1);
        Animal x = shark;
        if (shark.getName().equals("Shark")) {
            shark = null;
            System.out.println(x.getName());
        } else {
            consola.printString("Escoje un Tiburòn!");
            eliminateShark();
        }
    }

}
