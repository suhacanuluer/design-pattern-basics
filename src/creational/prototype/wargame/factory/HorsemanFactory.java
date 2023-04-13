package creational.prototype.wargame.factory;

import creational.prototype.wargame.common.WeaponEnum;
import creational.prototype.wargame.model.Army;
import creational.prototype.wargame.model.Warrior;

import static creational.prototype.wargame.utils.RandomUtils.getRandBetweenNumbers;

public class HorsemanFactory implements WarriorFactory {

    private final Warrior basicHorsemanPrototype = new Warrior(null, WeaponEnum.HORSE_SPEAR, 1, 1, 100);

    @Override
    public Warrior createWarrior(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, Army army) {
        Warrior prototype = basicHorsemanPrototype.clone();
        prototype.setHealth(getRandBetweenNumbers(minHealth, maxHealth));
        prototype.setAttackPower(getRandBetweenNumbers(minAttackPower, maxAttackPower));
        prototype.setArmor(getRandBetweenNumbers(minArmor, maxArmor));
        prototype.setArmy(army);
        return prototype;
    }
}
