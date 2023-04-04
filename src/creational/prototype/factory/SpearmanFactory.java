package creational.prototype.factory;

import creational.prototype.model.Warrior;

import static creational.prototype.utils.Utils.getRand;

public class SpearmanFactory implements WarriorFactory {

    private final Warrior basicSpearmanPrototype = new Warrior("white", "spear", 1, 1, 0);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, String color) {
        Warrior prototype = basicSpearmanPrototype.clone();
        prototype.setHealth(getRand(minHealth, maxHealth));
        prototype.setAttackPower(getRand(minAttackPower, maxAttackPower));
        prototype.setArmor(getRand(minArmor, maxArmor));
        prototype.setColor(color);
        return prototype;
    }
}
