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
        inside = new String[1][1];
        inside [0][0] = "~";
    }
    
//    public void printWaterTile(WaterTile x){
//        for(int i=1; i<4; i++){
//            for(int j=1; j<2; j++){
//                if(i<3){
//                    System.out.println(x.inside[i][j]);
//                }else{
//                    System.out.print(x.inside[i][j]);
//                }
//            }
//        }
//    }
    public void printWaterTile(WaterTile x){
        System.out.print(x.inside[0][0]);
    }

}
