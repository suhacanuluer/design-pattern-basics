package creational.prototype.factory;

import creational.prototype.common.ColorEnum;
import creational.prototype.model.Warrior;

public interface WarriorFactory {

    Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, ColorEnum color);
}
