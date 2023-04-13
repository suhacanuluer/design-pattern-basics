package creational.prototype.wargame.service;

import creational.prototype.wargame.factory.WarriorFactory;
import creational.prototype.wargame.model.Army;
import creational.prototype.wargame.model.DivisionSpec;
import creational.prototype.wargame.model.Warrior;

import java.util.List;

public class ArmyService {

    public void addDivisionToArmy(Army army, WarriorFactory factory, DivisionSpec spec) {
        addWarriorToDivision(factory, army, spec);
    }

    // rıdvan neden spec döndürmemizi istedi? void olsa daha iyi olmaz mıydı?
    private DivisionSpec addWarriorToDivision(WarriorFactory factory, Army army, DivisionSpec spec) {
        for (int i = 0; i < spec.getCount(); i++) {
            Warrior warrior = factory.createWarrior(spec.getMaxHealth(), spec.getMinHealth(), spec.getMaxAttackPower(),
                    spec.getMinAttackPower(), spec.getMaxArmor(), spec.getMinArmor(), army);
            List<Warrior> armyWarriors = army.getWarriors();
            armyWarriors.add(warrior);
        }
        return spec;
    }
}
