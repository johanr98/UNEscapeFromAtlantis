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
   
    private String[] inside;

    public ForestTile(int position, boolean inBoard, String effect) {
        super(position, true, effect);
        inside = new String[1];
        inside [0] = "T";
    }
    
    public void printForestTile(ForestTile x){
        System.out.print(x.inside[0]);
    }

}
