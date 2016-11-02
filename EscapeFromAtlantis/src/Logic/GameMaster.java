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
        FinishTile f = new FinishTile(0);
        ForestTile fo = new ForestTile(0, true, "None");
        MountainTile m = new MountainTile(0, true, "None");
        SandTile s = new SandTile(0, true, "None");
        WaterTile w = new WaterTile(0, true);

        map = new Board(m, fo, s, w, f);
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
        consola.printString("");
        int x = consola.returnInt();
        int y = consola.returnInt();
        mapManager.addVillagers(player1.getVillager1(), x, y);
        mapManager.addVillagers(player1.getVillager1(), x, y);
        consola.printString("");
        consola.printString(player2.getName() + " posiciona tus habitantes dentro del mapa");
        x = consola.returnInt();
        y = consola.returnInt();
        mapManager.addVillagers(player2.getVillager1(), x, y);
        mapManager.addVillagers(player2.getVillager1(), x, y);

    }

    /**
     * Agrega las fichas del jugador
     */
}
