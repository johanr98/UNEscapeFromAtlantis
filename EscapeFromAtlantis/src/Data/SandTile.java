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
public class SandTile extends Tile{

    public SandTile(int position, boolean inBoard, int maxPlayerQuantity, String effect){
        super(position, true,5, effect);
    }
    
    @Override
    public void removeTile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
