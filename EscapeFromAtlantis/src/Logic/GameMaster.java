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
    private Movement movement;

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

    public void endGame() {

    }

    public void eliminateWhale() {

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

    public void moveSeaSerpent() {
        movement.moveSeaSerpent();
    }

    public void moveShark() {
        movement.moveShark();
    }

    public void moveWhale() {
        movement.moveWhale();
    }

}
