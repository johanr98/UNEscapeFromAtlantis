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
    private ArrayList<Player> players;

    private static final int MAX_PLAYERS = 4;
    private static final int MIN_PLAYERS = 2;

    //Constructor GameMaster
    public GameMaster(GraphicsUI consola) {

        players = new ArrayList<Player>();

        this.consola = consola;//
        mapManager = new MapManager(consola);
    }

    public void initializePlayer(String name) {
        players.add(new Player(name));
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
