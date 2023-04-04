package creational.prototype.service;

import creational.prototype.factory.WarriorFactory;
import creational.prototype.model.Army;
import creational.prototype.model.DivisionSpec;
import creational.prototype.model.Warrior;

import java.util.List;

public class ArmyService {

    public void addDivisionToArmy(List<Army> armies, WarriorFactory factory, DivisionSpec spec) {
        for (Army army : armies) {
            addWarriorToDivision(factory, army, spec);
        }
    }

    private void addWarriorToDivision(WarriorFactory factory, Army army, DivisionSpec spec) {
        for (int i = 0; i < spec.getCount(); i++) {
            Warrior warrior = factory.createWarrior(spec.getMaxHealth(), spec.getMinHealth(), spec.getMaxAttackPower(),
                    spec.getMinAttackPower(), spec.getMaxArmor(), spec.getMinArmor(), army.getColor());
            List<Warrior> armyWarriors = army.getWarriors();
            armyWarriors.add(warrior);
        }
    }
}
