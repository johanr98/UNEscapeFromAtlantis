/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;

/**
 *
 * @author macas
 */
public class MapManager {

    public Tile changeTile(Tile tile) {
        return new WaterTile(tile.getPosition(), true);
    }
    
    public void comprobation(Tile tile){
        
        
        
    }

}