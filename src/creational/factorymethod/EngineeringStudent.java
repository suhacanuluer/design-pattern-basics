package creational.factorymethod;

import java.time.LocalDateTime;

public class EngineeringStudent extends Student {

    private String calculator;

    public EngineeringStudent(String name, LocalDateTime createDate, String calculator) {
        super(name, createDate);
        this.calculator = calculator;
    }
}
