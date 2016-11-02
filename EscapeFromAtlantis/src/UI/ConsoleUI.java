/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.*;
import Logic.*;
import java.util.Scanner;

/**
 *
 * @author macas
 */
public class ConsoleUI {

    private Scanner lector = new Scanner(System.in);

    public Player initializePlayer() {
        System.out.println("Ingrese el nombre del jugador");
        return new Player(lector.nextLine());
    }

    public ConsoleUI() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD

        System.out.println("Ingrese");
        Player player1 = new Player()

=======
        // Prueba de Dados
        
>>>>>>> origin/master
    }

}
