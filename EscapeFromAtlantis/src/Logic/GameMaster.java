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
    private GraphicsUI consola;
    private MapManager mapManager;
    private static final int numPlayers = 4;

    //Constructor GameMaster
    public GameMaster(GraphicsUI consola) {
        this.consola = consola;//
        mapManager = new MapManager(consola);
        start();
    }

    public GameMaster() {

    }

    //Metodo para Iniciar o finalizar el Juego
    public void start() {

    }

    public void inicializarJugador(int a) {
        Player[] players = new Player[a];
        for (int i = 0; i < a; i++) {
            consola.printString("Ingrese los datos del jugador " + i);
            players[i] = consola.initializePlayer();
        }
    }

    public void play() {

    }
    
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
