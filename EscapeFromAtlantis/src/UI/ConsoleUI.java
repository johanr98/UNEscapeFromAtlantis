/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.*;
import Logic.*;
<<<<<<< HEAD
import java.util.Scanner;
=======
import java.util.*;
>>>>>>> origin/master

/**
 *
 * @author macas
 */
public class ConsoleUI {

    private Scanner lector = new Scanner(System.in);
    private GameMaster gameMaster;

    public ConsoleUI() {
        gameMaster = new GameMaster(this);

    }

    public Player initializePlayer() {
        System.out.println("Ingrese el nombre del nuevo jugador:");
        return new Player(lector.nextLine());
    }

    public void menu() {
        System.out.println("Bienvenido a Survive: Escape From Atlantis");
        System.out.println("------------------------------------------");
        System.out.println("(1).Jugar (dos jugadores)");
        System.out.println("(0).Salir");
    }

    public int returnInt() {
        return Integer.parseInt(lector.nextLine());
    }

    public void printString(String something) {
        System.out.println(something);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ConsoleUI consola = new ConsoleUI();
        
        WaterTile test = new WaterTile(5,true);
        //test.printWaterTile(test);
        
        Board test2 = new Board(test);
        //test2.printBoard(test2);
        

    }

}
