package creational.factorymethod;

import java.time.LocalDateTime;

public class BusinessStudentFactoryImpl implements BusinessStudentFactory {

    private LocalDateTime now;

    @Override
    public Student createBusinessStudent(String name, String car) {
        now = LocalDateTime.now();
        return new BusinessStudent(name, now, car);
    }
}

