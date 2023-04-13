package creational.factorymethod.university;

import java.time.LocalDateTime;

public abstract class EngineeringStudent extends Student {

    private String calculator;

    public EngineeringStudent(String name, LocalDateTime createDate, String calculator) {
        super(name, createDate);
        this.calculator = calculator;
    }
}
