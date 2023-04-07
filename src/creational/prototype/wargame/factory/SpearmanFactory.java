package creational.prototype.wargame.factory;

import creational.prototype.wargame.common.WeaponEnum;
import creational.prototype.wargame.model.Army;
import creational.prototype.wargame.model.Warrior;

import static creational.prototype.wargame.utils.RandomUtils.getRandBetweenNumbers;

public class SpearmanFactory implements WarriorFactory {

    private final Warrior basicSpearmanPrototype = new Warrior(null, WeaponEnum.SPEAR, 1, 1, 0);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, Army army) {
        Warrior prototype = basicSpearmanPrototype.clone();
        prototype.setHealth(getRandBetweenNumbers(minHealth, maxHealth));
        prototype.setAttackPower(getRandBetweenNumbers(minAttackPower, maxAttackPower));
        prototype.setArmor(getRandBetweenNumbers(minArmor, maxArmor));
        prototype.setArmy(army);
        return prototype;
    }
}
