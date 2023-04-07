package creational.prototype.wargame.service;

import creational.prototype.wargame.common.ColorEnum;
import creational.prototype.wargame.model.Army;
import creational.prototype.wargame.model.Warrior;

import java.util.List;

import static creational.prototype.wargame.utils.RandomUtils.getRandUpToNumber;

public class WarService {

    public void warWithArmies(Army army1, Army army2) {

        Warrior firstWarrior = chooseWarrior(army2);
        Army army = warWithWarriors(firstWarrior, army1);

        System.out.println("The " + army.getColor() + " " + army.getName() + " army won the fucking war.");
    }

    private Army warWithWarriors(Warrior oldWinner, Army loserArmy) { // attack methodu burada olacak (hatta direkt bu olacak)
        Army oldWinnerArmy = oldWinner.getArmy();

        int oldWinnerArmyCount = oldWinnerArmy.getWarriors().size();
        int loserArmyCount = loserArmy.getWarriors().size();

        if (loserArmyCount > 0) {
            Warrior newChosenWarrior = chooseWarrior(loserArmy);
            Warrior newWinner = fight(newChosenWarrior, oldWinner);
            if (oldWinner == newWinner) {
                warWithWarriors(newWinner, loserArmy);
            } else if (oldWinnerArmyCount > 0) {
                warWithWarriors(newWinner, oldWinner.getArmy());
            }
        }
        return oldWinnerArmy;
    }

    private Warrior chooseWarrior(Army army) {
        List<Warrior> warriors = army.getWarriors();
        int warriorsCount = warriors.size();
        int chosenWarriorIndex = getRandUpToNumber(warriorsCount);
        Warrior chosenWarrior = warriors.get(chosenWarriorIndex);
        System.out.println("The " + chosenWarrior.getWeapon() + "-wielding warrior of the " + army.getColor()
                + " " + army.getName() + " army was chosen to fight.");
        return chosenWarrior;
    }

    private void killWarrior(Warrior deadWarrior) {
        Army deadWarriorsArmy = deadWarrior.getArmy();
        List<Warrior> warriors = deadWarriorsArmy.getWarriors();
        warriors.remove(deadWarrior);
        System.out.println("The " + deadWarrior.getWeapon() + "-wielding warrior of the " + deadWarriorsArmy.getColor()
                + " " + deadWarriorsArmy.getName() + " army died.");
    }

    private Warrior fight(Warrior attacker, Warrior defender) {
        ColorEnum attackerArmyColor = attacker.getArmy().getColor();
        ColorEnum defenderArmyColor = defender.getArmy().getColor();
        int attackPower = attacker.getAttackPower();
        int armor = defender.getArmor();
        int health = defender.getHealth();
        int damage = (int) (attackPower - ((armor / 100.0) * attackPower));
        defender.setHealth(health - damage);

        System.out.println("The " + attackerArmyColor + " " + attacker.getWeapon() + " warrior dealt " + damage
                + " damage to the " + defenderArmyColor + " " + defender.getWeapon() + " warrior."
                + defenderArmyColor + " " + defender.getWeapon() + " warrior health is " + defender.getHealth()
                + " now.");
        if (defender.getHealth() > 0) {
            fight(defender, attacker);
        } else {
            killWarrior(defender);
        }
        return attacker; // winner
    }

}

