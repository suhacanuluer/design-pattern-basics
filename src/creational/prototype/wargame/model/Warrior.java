package creational.prototype.wargame.model;

import creational.prototype.wargame.common.WeaponEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
@AllArgsConstructor
public class Warrior implements Cloneable {

    private Army army;

    private WeaponEnum weapon;

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
