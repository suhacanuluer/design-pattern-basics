package creational.prototype.wargame.factory;

import creational.prototype.wargame.model.Army;
import creational.prototype.wargame.model.Warrior;

public interface WarriorFactory {

    Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, Army army);
}
