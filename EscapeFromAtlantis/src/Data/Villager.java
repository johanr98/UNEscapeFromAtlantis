/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author macas
 */
public class Villager implements Serializable {

    private int value;
    private boolean inWater;

    private int positionX;
    private int positionY;

    public Villager(int x, int y) {
        positionX = x;
        positionY = y;
        inWater = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isInWater() {
        return inWater;
    }

    public void setInWater(boolean inWater) {
        this.inWater = inWater;
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
