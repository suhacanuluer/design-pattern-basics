package creational.prototype.service;

import creational.prototype.model.Army;
import creational.prototype.model.Warrior;

import java.util.List;

import static creational.prototype.utils.RandomUtils.getRandUpToNumber;

public class WarService {
    /*
    public Army warWithArmies(Army army1, Army army2) {

        Warrior army1sWarrior = chooseWarrior(army1);
        Warrior army2sWarrior = chooseWarrior(army2);


        return winnerArmy;
    }

    public Warrior warWithWarriors(Army army1, Army army2) {


        Warrior newChoosenWarrior = chooseWarrior();
        return warWithWarriors(winnerWarrior, newChoosenWarrior);
    }
    */

    private Warrior chooseWarrior(Army army) {
        List<Warrior> warriors = army.getWarriors();
        int warriorsCount = warriors.size();
        return warriors.get(getRandUpToNumber(warriorsCount));
    }

    private void killWarrior(Warrior deadWarrior, Army deadWarriorsArmy) {
        List<Warrior> warriors = deadWarriorsArmy.getWarriors();
        warriors.remove(deadWarrior);
        System.out.println("The " + deadWarrior.getWeapon() + "-wielding warrior of the " + deadWarriorsArmy.getColor()
                + " " + deadWarriorsArmy.getName() + " army died.");
    }

}

