/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author macas
 */
public class Villager {

    private int value;
    private boolean alive;

    private int tilePosition[];
    
    public Villager(){
        
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int[] getTilePosition() {
        return tilePosition;
    }

    public void setTilePosition(int x, int y) {
        tilePosition[0] = x;
        tilePosition[1] = y;
    }
}
