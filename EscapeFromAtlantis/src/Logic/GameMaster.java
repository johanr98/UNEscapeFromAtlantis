/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.*;

/**
 *
 * @author johans
 */
public class GameMaster {

    private ConsoleUI consola;

    public GameMaster(ConsoleUI consola) {
        this.consola = consola;
    }

    public void start() {
        consola.menu();
        outerloop:
        while (true) {

            switch (consola.returnInt()) {

                case 1:
                    play();
                    break outerloop;
                case 0:
                    System.exit(0);
                    break;
                default:
                    consola.printString("Ingresa de nuevo el valor");
                    break;

            }
        }
    }

    public void play() {

    }

}
