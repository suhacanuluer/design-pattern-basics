package creational.prototype.factory;

import creational.prototype.model.Warrior;

import static creational.prototype.utils.Utils.getRand;

public class HorsemanFactory implements WarriorFactory {

    private final Warrior basicHorsemanPrototype = new Warrior("white", "spear", 1, 1, 100);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, String color) {
        Warrior prototype = basicHorsemanPrototype.clone();
        prototype.setHealth(getRand(minHealth, maxHealth));
        prototype.setAttackPower(getRand(minAttackPower, maxAttackPower));
        prototype.setArmor(getRand(minArmor, maxArmor));
        prototype.setColor(color);
        return prototype;
    }
}
