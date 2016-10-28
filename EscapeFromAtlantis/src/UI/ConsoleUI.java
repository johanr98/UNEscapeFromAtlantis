/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.*;
import Logic.*;

/**
 *
 * @author macas
 */
public class ConsoleUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prueba de Dados
        
        NumberDice DiceOfNumbers = new NumberDice();
        AnimalsDice DiceOfAnimals = new AnimalsDice();
        DiceResult ThrowDice = new DiceResult();
        
        ThrowDice.result(DiceOfNumbers, DiceOfAnimals);
    }
    
}
