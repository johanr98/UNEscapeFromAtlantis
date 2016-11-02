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
public class WaterTile extends Tile {
    
    private String[] inside;
    
    public WaterTile(int position, boolean inBoard) {
        super(position, true, "NULL");
        inside = new String[1];
        inside [0] = "~";
    }

    public void printWaterTile(WaterTile x){
        System.out.print(x.inside[0]);
    }

}
