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
        mapManager.addVillagers(player1.getVillager1(), x, y);
        consola.printString("");

        map.printBoard(player1, player2);

        consola.printString(player2.getName() + " posiciona tus habitantes dentro del mapa");
        x = consola.returnInt();
        y = consola.returnInt();
        mapManager.addVillagers(player2.getVillager1(), x, y);
        mapManager.addVillagers(player2.getVillager1(), x, y);

        consola.printString("");
        map.printBoard(player1, player2);
        int v = 0;
        int w = 0;
        while (v==0 && w==0) {
            consola.printString("Sigue moviendo tus habitantes hacia la salvación!!");
            consola.printString(player1.getName() + " Mueve a tus habitantes (x,y)");
            x = consola.returnInt();
            y = consola.returnInt();
            moveVillagers(player1.getVillager1(), x, y);
            map.printBoard(player1, player2);
            consola.printString("Sigue moviendo tus habitantes hacia la salvación!!");
            consola.printString(player2.getName() + " Mueve a tus habitantes (x,y)");
            x = consola.returnInt();
            y = consola.returnInt();
            moveVillagers(player2.getVillager1(), x, y);
            map.printBoard(player1, player2);
            v=endGame(player1.getVillager1());
            w=endGame(player2.getVillager1());
        }

    }

    public void moveVillagers(Villager villager, int x, int y) {
        villager.setTilePosition(x, y);
    }

    /**
     * Agrega las fichas del jugador
     */
    
    public int endGame(Villager villager){
        if((villager.getPositionX()==0 && villager.getPositionY()==0  )|| 
                ((villager.getPositionX()==4&& villager.getPositionY()==0 ))){
            System.out.println("Fin del juego.");
            System.out.println();
            return 1;
        } else {
            return 0;
        }
    }
}
