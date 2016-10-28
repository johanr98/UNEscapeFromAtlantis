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
public class AnimalsDice extends Dice{
    
    public AnimalsDice(){
        super.face1 = "GiantSquid";
        super.face2 = "SeaSerpent";
        super.face3 = "Dolphin";
        super.face4 = "GiantSquid";
        super.face5 = "Shark";
        super.face6 = "Shark";
    }
    
    @Override
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
