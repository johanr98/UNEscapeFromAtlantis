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
    
    private String[][] inside;
    
    public WaterTile(int position, boolean inBoard) {
        super(position, true, "NULL");
        inside = new String[4][2];
        inside [1][1] = "~~~~~";
        inside [2][1] = "~   ~";
        inside [3][1] = "~~~~~";
    }
    
    public void printWaterTile(WaterTile x){
        for(int i=1; i<4; i++){
            for(int j=1; j<2; j++){
                System.out.println(x.inside[i][j]);
            }
        }
    }

}
