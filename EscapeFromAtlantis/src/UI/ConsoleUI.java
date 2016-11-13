/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.*;
import Logic.*;
import java.util.*;

/**
 *
 * @author macas
 */
public class ConsoleUI {

    private Scanner lector = new Scanner(System.in);
    private GameMaster gameMaster;
    private Scanner entero = new Scanner(System.in);

    public ConsoleUI(Board board) {
        gameMaster = new GameMaster(this, board);

    }

    public Player initializePlayer() {
        System.out.println("Ingrese el nombre del nuevo jugador y la posicion (x,y):");

        return new Player(lector.nextLine(), entero.nextInt(), entero.nextInt());
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

    //Metodos de seleccion de elementos del tablero
    public Animal selectAnimal() {

    }

    public Tile selectTile() {

    }

    public Boat selectBoat() {

    }

    /**
     * @param args the command line arguments
     */
}
