package creational.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DivisionSpec {

        private int maxHealth;

        private int minHealth;

        private int maxAttackPower;

        private int minAttackPower;

        private int maxArmor;

        private int minArmor;

        private int count;
}
