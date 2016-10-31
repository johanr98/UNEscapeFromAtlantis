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
public abstract class Dice {

    private final int facesAmount = 6;
    protected String name;
    protected String face1;
    protected String face2;
    protected String face3;
    protected String face4;
    protected String face5;
    protected String face6;

    //johan :  
    //yo creeria que se puede hacer uso de Enum para que sea mas versatil
    public String callface(int a) {
        switch (a) {
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
