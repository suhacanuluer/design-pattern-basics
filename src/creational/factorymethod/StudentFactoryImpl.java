package creational.factorymethod;

import java.time.LocalDateTime;

public class StudentFactoryImpl implements StudentFactory {

    private LocalDateTime now;
    @Override
    public Student createStudent(String name) {
        now = LocalDateTime.now();
        return new Student(name, now);
    }

    @Override
    public Student createBusinessStudent(String name, String car) {
        now = LocalDateTime.now();
        return new BusinessStudent(name, now, car);
    }
}

