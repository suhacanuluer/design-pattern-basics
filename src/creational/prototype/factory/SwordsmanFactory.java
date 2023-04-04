package creational.prototype.factory;

import creational.prototype.model.Warrior;

import static creational.prototype.utils.Utils.getRand;

public class SwordsmanFactory implements WarriorFactory {

    private Warrior basicSwordsmanPrototype = new Warrior("white", false, "sword", 1, 1, 0);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor) {
        Warrior prototype = basicSwordsmanPrototype.clone();
        prototype.setHealth(getRand(minHealth, maxHealth));
        prototype.setAttackPower(getRand(minAttackPower, maxAttackPower));
        prototype.setArmor(getRand(minArmor, maxArmor));
        return prototype;
    }
}
