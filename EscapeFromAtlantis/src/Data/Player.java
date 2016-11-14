/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author macas
 */
public class Player implements Serializable {

    private String name;
    private Villager[] villagers;

    public Player(String name) {

        this.name = name;

        villagers = new Villager[10];

        villagers[0].setValue(1);
        villagers[1].setValue(1);
        villagers[2].setValue(1);
        villagers[3].setValue(2);
        villagers[4].setValue(2);
        villagers[5].setValue(3);
        villagers[6].setValue(3);
        villagers[7].setValue(4);
        villagers[8].setValue(5);
        villagers[9].setValue(6);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Villager[] getVillagers() {
        return villagers;
    }

}
