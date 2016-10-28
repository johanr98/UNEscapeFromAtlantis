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
public class NumberDice extends Dice {
    public NumberDice() {
        super.face1 = "1";
        super.face2 = "2";
        super.face3 = "3";
        super.face4 = "4";
        super.face5 = "5";
        super.face6 = "6";
    }
    public String callface(int a){
        switch(a){
            case 0:
                return face1;
            case 1:
                return face2;
            case 2:
                return face3;
            case 3:
                return face4;
            case 4:
                return face5;
            case 5:
                return face6;
            default:
                return "Error";
        }
    }
}
