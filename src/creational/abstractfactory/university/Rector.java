package creational.abstractfactory.university;

import java.time.LocalDateTime;

public class Rector {
    private String name;
    private LocalDateTime createDate;

    public Rector(String name, LocalDateTime createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    public void work() {
        System.out.println("Rector " + name + " is working");
    }
}
