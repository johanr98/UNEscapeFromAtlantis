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
public class Player {

    private String name;
    private Villager villagers1;
    private Villager villagers2;

    public Player(String name) {
        this.name = name;

        villagers1 = new Villager();
        villagers2 = new Villager();

        villagers1.setValue(1);
        villagers2.setValue(2);

        /**
         * villagers[2].setValue(1); villagers[3].setValue(2);
         * villagers[4].setValue(2); villagers[5].setValue(3);
         * villagers[6].setValue(3); villagers[7].setValue(4);
         * villagers[8].setValue(5); villagers[9].setValue(6);
         */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Villager getVillager1() {
        return villagers1;
    }

    public Villager getVillager2() {
        return villagers2;
    }

}
