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
public class ChangeTile {

    public Tile changeTile(Tile tile) {
        return new WaterTile(tile.getPosition(), true, "NONE");
    }

}
