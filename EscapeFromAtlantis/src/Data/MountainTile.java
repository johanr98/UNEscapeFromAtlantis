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
public class MountainTile extends Tile {

    private String inside;

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }
    
    public MountainTile(int position, boolean inBoard, String effect) {
        super(position, true, effect);
        inside = "^";
    }
    
    public void printMountainTile(MountainTile x){
        System.out.print(x.inside);
    }
    
}
