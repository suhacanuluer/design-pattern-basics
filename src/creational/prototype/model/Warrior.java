package creational.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Warrior implements Cloneable {

    private String color;

    private Boolean hasArmor;

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
