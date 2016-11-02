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

    public ConsoleUI(Board board) {
        gameMaster = new GameMaster(this, board);

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

        WaterTile test = new WaterTile(5, true);
        ForestTile test2 = new ForestTile(5, true, "None");
        MountainTile test3 = new MountainTile(5, true, "None");
        FinishTile test4 = new FinishTile(5);
        SandTile test5 = new SandTile(5, true, "None");
        Board test6 = new Board(test3, test2, test5, test, test4);
        ConsoleUI consola = new ConsoleUI(test6);

    }

}
