/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;
import java.util.*;

/**
 *
 * @author macas
 */
public class DiceResult {
    
    public int roll() {
        // Generate a random number between 1 and 6 then return the value
        Random gen = new Random();
        int number = gen.nextInt(7);
        return number;
    }
    
    public void result(NumberDice x, AnimalsDice y){
        int a = roll();
        int b = roll();
        System.out.println("El Dado de Animales da: " + y.callface(a));
        System.out.println("El Dado Numerico da: " + x.callface(b));
    }
    
}
