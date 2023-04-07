package creational.prototype.model;

import creational.prototype.common.ColorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Warrior implements Cloneable {

    private ColorEnum color;

    private String weapon;

    private int attackPower;

    private int health;

    private int armor;

    @Override
    public Warrior clone() {
        Warrior warrior = null;
        try {
            warrior = (Warrior) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("cloning problem: " + e.getMessage());
            e.printStackTrace();
        }
        return warrior;
    }
}
