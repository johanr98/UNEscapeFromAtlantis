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
    private final int facesAmount=6;
    protected String name;
    protected String face1;
    protected String face2;
    protected String face3;
    protected String face4;
    protected String face5;
    protected String face6;
    
    //johan :  
    //yo creeria que se puede hacer uso de Enum para que sea mas versatil
    
    public abstract String callface(int a);

}
