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

    }

    public void play() {

    }

    public void moveVillagers(Villager villager, int x, int y) {
        villager.setTilePosition(x, y);
    }

    public void endGame() {

    }

    public void moveSnake() {

    }

    public void moveBoat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void moveShark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void moveWhale() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminateWhale() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminateShark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
