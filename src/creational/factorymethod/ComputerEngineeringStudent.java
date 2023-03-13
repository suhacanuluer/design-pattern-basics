package creational.factorymethod;

import java.time.LocalDateTime;

public class ComputerEngineeringStudent extends EngineeringStudent {

    private final String computer = "apple";

    public ComputerEngineeringStudent(String name, LocalDateTime createDate, String calculator) {
        super(name, createDate, calculator);
    }

    public String getComputer() {
        return computer;
    }
}
