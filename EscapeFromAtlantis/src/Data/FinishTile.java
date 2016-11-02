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

    private String[] inside;
    
    public FinishTile(int position) {
        super(position, true, "Player saved token");
        inside = new String[1];
        inside [0] = "-";
    }
    
    public void printFinishTile(FinishTile x){
        System.out.print(x.inside[0]);
    }
    
    

}
