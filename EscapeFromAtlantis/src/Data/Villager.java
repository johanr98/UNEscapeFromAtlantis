/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Random;

/**
 *
 * @author macas
 */
public class Villager {

    private int value;
    private boolean alive;

    private int positionX;
    private int positionY;

    public Villager(int x, int y) {
        positionX = x;
        positionY = y;
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

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setTilePosition(int x, int y) {
        positionX = x;
        positionY = y;
    }
}
