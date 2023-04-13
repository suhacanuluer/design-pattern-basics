package creational.abstractfactory.university;

import creational.factorymethod.university.BusinessStudent;
import creational.factorymethod.university.ComputerEngineeringStudent;
import creational.factorymethod.university.ElectricalEngineeringStudent;
import creational.factorymethod.university.Student;

import java.time.LocalDateTime;
public class AdanaUniversityFactory implements UniversityFactory {

    private LocalDateTime now;
    @Override
    public Rector createRector(String name) {
        now = LocalDateTime.now();
        System.out.println("Adana University Rector created");
        return new Rector(name, now);
    }

    @Override
    public Student createBusinessStudent(String name, String car) {
        now = LocalDateTime.now();
        System.out.println("Adana University Business Student created");
        return new BusinessStudent(name, now, car);
    }

    @Override
    public Student createComputerEngineeringStudent(String name) {
        now = LocalDateTime.now();
        System.out.println("Adana University Computer Engineering Student created");
        return new ComputerEngineeringStudent(name, now, "casio");
    }

    @Override
    public Student createElectricalEngineeringStudent(String name) {
        now = LocalDateTime.now();
        System.out.println("Adana University Electrical Engineering Student created");
        return new ElectricalEngineeringStudent(name, now, "casio");
    }
}
