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

    public void play() {

        consola.printString("Datos del jugador 1");
        Player player1 = consola.initializePlayer();
        consola.printString("Datos del jugador 2");
        Player player2 = consola.initializePlayer();
        consola.printString("");
        map.printBoard(player1, player2);

        consola.printString("");
        consola.printString(player1.getName() + " posiciona tus habitantes dentro del mapa");
        consola.printString("Ingresa la posicion (x,y) de tus habitantes");
        consola.printString("");

        int x = consola.returnInt();
        int y = consola.returnInt();

        mapManager.addVillagers(player1.getVillager1(), x, y);

        consola.printString("");

        map.printBoard(player1, player2);

        consola.printString(player2.getName() + " posiciona tus habitantes dentro del mapa");

        x = consola.returnInt();
        y = consola.returnInt();

        mapManager.addVillagers(player2.getVillager1(), x, y);

        consola.printString("");
        map.printBoard(player1, player2);
        int v = 0;
        int w = 0;
        while (v == 0 && w == 0) {

            consola.printString("Sigue moviendo tus habitantes hacia la salvación!!");
            consola.printString(player1.getName() + " Mueve a tus habitantes (x,y)");

            x = consola.returnInt();
            y = consola.returnInt();

            moveVillagers(player1.getVillager1(), x, y);

            map.printBoard(player1, player2);
            v = endGame(player1.getVillager1());
            consola.printString("Sigue moviendo tus habitantes hacia la salvación!!");
            consola.printString(player2.getName() + " Mueve a tus habitantes (x,y)");
            x = consola.returnInt();
            y = consola.returnInt();
            moveVillagers(player2.getVillager1(), x, y);
            map.printBoard(player1, player2);

            w = endGame(player2.getVillager1());
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
}
