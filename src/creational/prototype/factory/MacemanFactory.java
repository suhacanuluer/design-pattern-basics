package creational.prototype.factory;

import creational.prototype.model.Warrior;

import static creational.prototype.utils.Utils.getRand;

public class MacemanFactory implements WarriorFactory {

    private Warrior basicMacemanPrototype = new Warrior("white", false, "mace", 1, 1, 0);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor) {
        Warrior prototype = basicMacemanPrototype.clone();
        prototype.setHealth(getRand(minHealth, maxHealth));
        prototype.setAttackPower(getRand(minAttackPower, maxAttackPower));
        prototype.setArmor(getRand(minArmor, maxArmor));
        return prototype;
    }
}
