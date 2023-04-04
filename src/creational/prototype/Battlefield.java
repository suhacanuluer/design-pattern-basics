package creational.prototype;

import creational.prototype.factory.*;
import creational.prototype.model.Army;
import creational.prototype.model.DivisionSpec;
import creational.prototype.service.ArmyService;

import java.util.ArrayList;
import java.util.List;

import static creational.prototype.utils.Utils.getRand;


public class Battlefield {
    public static void main(String[] args) {

        // todo: use design pattern for armies
        Army blueArmy = new Army("Blue");
        Army redArmy = new Army("Red");

        List<Army> armies = new ArrayList<>();
        armies.add(blueArmy);
        armies.add(redArmy);

        // todo: newlemekten kurtul
        WarriorFactory archerFactory = new ArcherFactory();
        WarriorFactory horsemanFactory = new HorsemanFactory();
        WarriorFactory macemanFactory = new MacemanFactory();
        WarriorFactory spearmanFactory = new SpearmanFactory();
        WarriorFactory swordsmanFactory = new SwordsmanFactory();

        final ArmyService armyService = new ArmyService();

        DivisionSpec archerSpec = DivisionSpec.createSpec(100, 50, 10,
                5, 70, 50, getRand(7, 10));
        armyService.addDivisionToArmy(armies, archerFactory, archerSpec);

        DivisionSpec horsemanSpec = DivisionSpec.createSpec(100, 80, 50,
                30, 100, 70, getRand(7, 10));
        armyService.addDivisionToArmy(armies, horsemanFactory, horsemanSpec);

        DivisionSpec macemanSpec = DivisionSpec.createSpec(100, 50, 50,
                20, 50, 30, getRand(7, 10));
        armyService.addDivisionToArmy(armies, macemanFactory, macemanSpec);

        DivisionSpec spearmanSpec = DivisionSpec.createSpec(100, 50, 30,
                15, 70, 50, getRand(7, 10));
        armyService.addDivisionToArmy(armies, spearmanFactory, spearmanSpec);

        DivisionSpec swordsmanSpec = DivisionSpec.createSpec(100, 50, 50,
                30, 70, 50, getRand(7, 10));
        armyService.addDivisionToArmy(armies, swordsmanFactory, swordsmanSpec);

        System.out.println(blueArmy);
        System.out.println(redArmy);

    }

}
