package creational.prototype.factory;

import creational.prototype.common.ColorEnum;
import creational.prototype.model.Warrior;

import static creational.prototype.utils.RandomUtils.getRandBetweenNumbers;

public class SpearmanFactory implements WarriorFactory {

    private final Warrior basicSpearmanPrototype = new Warrior(null, "spear", 1, 1, 0);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, ColorEnum color) {
        Warrior prototype = basicSpearmanPrototype.clone();
        prototype.setHealth(getRandBetweenNumbers(minHealth, maxHealth));
        prototype.setAttackPower(getRandBetweenNumbers(minAttackPower, maxAttackPower));
        prototype.setArmor(getRandBetweenNumbers(minArmor, maxArmor));
        prototype.setColor(color);
        return prototype;
    }
}
