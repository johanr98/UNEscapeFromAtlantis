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
public abstract class Tile {

    private final int MAX_PLAYER = 5;
    private boolean inBoard;

    private String effect;
    private int position;

    public boolean isInBoard() {
        return inBoard;
    }

    public void setInBoard(boolean inBoard) {
        this.inBoard = inBoard;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Tile(int position, boolean inBoard, String effect) {
        this.position = position;
        this.inBoard = inBoard;
        this.effect = effect;
    }

    public abstract void removeTile();

}
