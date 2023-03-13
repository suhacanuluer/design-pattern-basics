package creational.factorymethod;

import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class Student {

    private int id = 0;
    private String name;
    private LocalDateTime createDate;

    public Student(String name, LocalDateTime createDate) {
        this.id++;
        this.name = name;
        this.createDate = createDate;
    }

    public void study() {
        System.out.println(name + " is studying");
    }
}
