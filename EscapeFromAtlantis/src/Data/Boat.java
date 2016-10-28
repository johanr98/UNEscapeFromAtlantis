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
public class Boat {
    private int quantity;
    private boolean full;
    private String mayorTeam;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public String getMayorTeam() {
        return mayorTeam;
    }

    public void setMayorTeam(String mayorTeam) {
        this.mayorTeam = mayorTeam;
    }
}
