/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.*;

/**
 *
 * @author macas
 */
public class Team {
    private List<Villager> villagers;
    private String color;

    public List<Villager> getVillagers() {
        return villagers;
    }

    public void setVillagers(List<Villager> villagers) {
        this.villagers = villagers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
