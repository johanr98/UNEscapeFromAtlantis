/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author johans
 */
public class FinishTile extends Tile {

    public FinishTile(int position, boolean inBoard, String effect) {
        super(position, true, "Player saved token");
    }

}
