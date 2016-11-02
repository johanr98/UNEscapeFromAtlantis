/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.*;
import Data.*;

/**
 *
 * @author johans
 */
public class GameMaster {

    private ConsoleUI consola;
    private Board map;
    private MapManager mapManager;

    public GameMaster(ConsoleUI consola) {
        this.consola = consola;

        map = new Board();
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

        consola.printString("Datos del jugador 1");
        Player player1 = consola.initializePlayer();
        consola.printString("Datos del jugador 2");
        Player player2 = consola.initializePlayer();

        consola.printString(player1.getName() + " posiciona tus habitantes dentro del mapa");
        consola.printString("Ingresa la posicion (x,y) de tus habitantes");

        mapManager.addVillagers(player1.getVillagers()[0], consola.returnInt(), consola.returnInt());
        mapManager.addVillagers(player1.getVillagers()[1], consola.returnInt(), consola.returnInt());

        consola.printString(player2.getName() + " posiciona tus habitantes dentro del mapa");
        mapManager.addVillagers(player2.getVillagers()[0], consola.returnInt(), consola.returnInt());
        mapManager.addVillagers(player2.getVillagers()[1], consola.returnInt(), consola.returnInt());

    }

    /**
     * Agrega las fichas del jugador
     */
}
