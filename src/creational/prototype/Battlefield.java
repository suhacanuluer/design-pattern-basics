package creational.prototype;

import creational.prototype.factory.*;
import creational.prototype.model.DivisionSpec;
import creational.prototype.model.Warrior;

import java.util.ArrayList;
import java.util.List;

import static creational.prototype.utils.Utils.getRand;

public class Battlefield {
    public static void main(String[] args) {

        List<Warrior> blueArmy = new ArrayList<>();
        List<Warrior> redArmy = new ArrayList<>();

        ArcherFactory archerFactory = new ArcherFactory();
        HorsemanFactory horsemanFactory = new HorsemanFactory();
        MacemanFactory macemanFactory = new MacemanFactory();
        SpearmanFactory spearmanFactory = new SpearmanFactory();
        SwordsmanFactory swordsmanFactory = new SwordsmanFactory();

        DivisionSpec archerSpec = new DivisionSpec(100, 50, 10,
                5, 70, 50, getRand(7, 10));

        addWarriorToArmy(archerFactory, blueArmy, archerSpec);
        addWarriorToArmy(archerFactory, redArmy, archerSpec);

        System.out.println(blueArmy);
        System.out.println(redArmy);


    }
    static List<Warrior> addWarriorToArmy(WarriorFactory factory, List<Warrior> army, DivisionSpec spec) {
        for (int i = 0; i < spec.getCount(); i++) {
            Warrior warrior = factory.createWarrior(spec.getMaxHealth(), spec.getMinHealth(), spec.getMaxAttackPower(),
                    spec.getMinAttackPower(), spec.getMaxArmor(), spec.getMinArmor());
            army.add(warrior);
        }
        return army;
    }
}
