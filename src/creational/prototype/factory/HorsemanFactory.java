package creational.prototype.factory;

import creational.prototype.common.ColorEnum;
import creational.prototype.model.Warrior;

import static creational.prototype.utils.RandomUtils.getRandBetweenNumbers;

public class HorsemanFactory implements WarriorFactory {

    private final Warrior basicHorsemanPrototype = new Warrior(null, "spear and horse", 1, 1, 100);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, ColorEnum color) {
        Warrior prototype = basicHorsemanPrototype.clone();
        prototype.setHealth(getRandBetweenNumbers(minHealth, maxHealth));
        prototype.setAttackPower(getRandBetweenNumbers(minAttackPower, maxAttackPower));
        prototype.setArmor(getRandBetweenNumbers(minArmor, maxArmor));
        prototype.setColor(color);
        return prototype;
    }
}
