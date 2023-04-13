package creational.prototype.wargame;

import creational.prototype.wargame.common.ColorEnum;
import creational.prototype.wargame.factory.*;
import creational.prototype.wargame.model.Army;
import creational.prototype.wargame.model.DivisionSpec;
import creational.prototype.wargame.service.ArmyService;
import creational.prototype.wargame.service.WarService;

import static creational.prototype.wargame.utils.RandomUtils.getRandBetweenNumbers;

public class Battlefield {
    public static void main(String[] args) {

        // todo: use design pattern for armies
        Army blueArmy = new Army("butterflies", ColorEnum.BLUE);
        Army redArmy = new Army("bugs", ColorEnum.RED);


        // todo: newlemekten kurtul
        WarriorFactory archerFactory = new ArcherFactory();
        WarriorFactory horsemanFactory = new HorsemanFactory();
        WarriorFactory macemanFactory = new MacemanFactory();
        WarriorFactory spearmanFactory = new SpearmanFactory();
        WarriorFactory swordsmanFactory = new SwordsmanFactory();

        final ArmyService armyService = new ArmyService();
        final WarService warService = new WarService();

        DivisionSpec archerSpec = DivisionSpec.createSpec(100, 50, 30,
                5, 70, 50, getRandBetweenNumbers(7, 10));
        armyService.addDivisionToArmy(blueArmy, archerFactory, archerSpec);
        armyService.addDivisionToArmy(redArmy, archerFactory, archerSpec);

        DivisionSpec horsemanSpec = DivisionSpec.createSpec(100, 80, 50,
                30, 90, 70, getRandBetweenNumbers(7, 10));
        armyService.addDivisionToArmy(blueArmy, horsemanFactory, horsemanSpec);
        armyService.addDivisionToArmy(redArmy, archerFactory, archerSpec);

        DivisionSpec macemanSpec = DivisionSpec.createSpec(100, 50, 50,
                20, 50, 30, getRandBetweenNumbers(7, 10));
        armyService.addDivisionToArmy(blueArmy, macemanFactory, macemanSpec);
        armyService.addDivisionToArmy(redArmy, archerFactory, archerSpec);

        DivisionSpec spearmanSpec = DivisionSpec.createSpec(100, 50, 30,
                15, 70, 50, getRandBetweenNumbers(7, 10));
        armyService.addDivisionToArmy(blueArmy, spearmanFactory, spearmanSpec);
        armyService.addDivisionToArmy(redArmy, archerFactory, archerSpec);

        DivisionSpec swordsmanSpec = DivisionSpec.createSpec(100, 50, 50,
                30, 70, 50, getRandBetweenNumbers(7, 10));
        armyService.addDivisionToArmy(blueArmy, swordsmanFactory, swordsmanSpec);
        armyService.addDivisionToArmy(redArmy, archerFactory, archerSpec);

//        System.out.println(blueArmy);
//        System.out.println(redArmy);

        warService.warWithArmies(blueArmy, redArmy);

    }
}
