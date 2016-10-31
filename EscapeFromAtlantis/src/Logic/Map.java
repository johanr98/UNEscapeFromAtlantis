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
public class Map {

    static final int WATERTILEQUANTITY = 133;
    static final int SALVATIONTILEQUANTITY = 12;
    static final int SANDTILEQUANTITY = 16;
    static final int FORESTTILEQUANTITY = 16;
    static final int MOUNTAINTILEQUANTITY = 8;

    private Box<Tile> box[][];

    public Map() {
        box = new Box[13][25];

        //salvacion Esquina izquierda superior
        box[0][2].setT(new FinishTile(1));
        box[1][1].setT(new FinishTile(10));
        box[2][0].setT(new FinishTile(22));
        //salvacion Esquina derecha superior
        box[0][22].setT(new FinishTile(9));
        box[1][23].setT(new FinishTile(19));
        box[2][24].setT(new FinishTile(30));
        //salvacion esquina inferior izquierda
        box[10][0].setT(new FinishTile(112));
        box[11][1].setT(new FinishTile(124));
        box[12][2].setT(new FinishTile(136));
        //salvacion esquina inferior derecha
        box[10][24].setT(new FinishTile(123));
        box[11][23].setT(new FinishTile(135));
        box[12][22].setT(new FinishTile(144));
    }

}
