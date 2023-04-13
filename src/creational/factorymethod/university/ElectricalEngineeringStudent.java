package creational.factorymethod.university;

import java.time.LocalDateTime;

public class ElectricalEngineeringStudent extends EngineeringStudent {

    private Boolean toolBag = true;

    public ElectricalEngineeringStudent(String name, LocalDateTime createDate, String calculator) {
        super(name, createDate, calculator);
    }
}
