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
public class ForestTile extends Tile {

    public ForestTile(int position, boolean inBoard, String effect) {
        super(position, true, effect);
    }

    @Override
    public void removeTile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
