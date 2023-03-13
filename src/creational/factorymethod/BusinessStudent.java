package creational.factorymethod;

import java.time.LocalDateTime;

public class BusinessStudent extends Student {

    private String car;
    public BusinessStudent(String name, LocalDateTime createDate, String car) {
        super(name, createDate);
        this.car = car;
    }
}
