package creational.abstractfactory.university;

import creational.factorymethod.university.Student;

public interface UniversityFactory {
    Rector createRector(String name);
    Student createBusinessStudent(String name,String car);
    Student createComputerEngineeringStudent(String name);
    Student createElectricalEngineeringStudent(String name);
}
