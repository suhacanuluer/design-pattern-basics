package creational.prototype.wargame.model;

import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class DivisionSpec {

        private int maxHealth;

        private int minHealth;

        private int maxAttackPower;

        private int minAttackPower;

        private int maxArmor;

        private int minArmor;

        private int count;

        private DivisionSpec(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, int count) {
                this.maxHealth = maxHealth;
                this.minHealth = minHealth;
                this.maxAttackPower = maxAttackPower;
                this.minAttackPower = minAttackPower;
                this.maxArmor = maxArmor;
                this.minArmor = minArmor;
                this.count = count;
        }

        public static DivisionSpec createSpec(int maxHealth, int minHealth, int maxAttackPower, int minAttackPower, int maxArmor, int minArmor, int count) {
                return new DivisionSpec(maxHealth, minHealth, maxAttackPower, minAttackPower, maxArmor, minArmor, count);
        }
}
