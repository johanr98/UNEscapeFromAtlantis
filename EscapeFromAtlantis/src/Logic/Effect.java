/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Tile;
import UI.*;

/**
 *
 * @author macas
 */
public class Effect {

    private GraphicsUI graficadora;
    private GameMaster master;

    public Effect(GraphicsUI graficadora, GameMaster master) {
        this.master = master;
        this.graficadora = graficadora;

    }

    public void accionarEfecto(Tile tile) {
        switch (tile.getEffect()) {
            case "volcan":
                graficadora.endScreen();
                break;
            case "agua":

                break;
            case "poner ballena":
                graficadora.drawWhale();
                break;
            case "poner tiburon":
                graficadora.drawShark();
                break;
            case "poner barco":
                graficadora.drawBoat();
                break;
            case "mover serpiente":
                master.moveSnake();
                break;
            case "mover barco":
                master.moveBoat();
                break;
            case "mover tiburon":
                master.moveShark();
                break;
            case "mover ballena":
                master.moveWhale();
                break;
            case "eliminar ballena":
                master.eliminateWhale();
                break;
            case "eliminar tiburon":
                master.eliminateShark();
                break;

        }

    }
}
