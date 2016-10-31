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
public abstract class Animal {

    private int position;
    private int movementAlowed;

    public Animal(int position, int movementAlowed) {
        this.position = position;
        this.movementAlowed = movementAlowed;

    }

    public int getPosition() {
        return position;
    }

    public int getMovementAlowed() {
        return movementAlowed;
    }

    public abstract void doEffect();

}
