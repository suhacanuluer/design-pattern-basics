package creational.factorymethod.university;

public interface EngineeringStudentFactory {

    EngineeringStudent createComputerEngineeringStudent(String name);
    EngineeringStudent createElectricalEngineeringStudent(String name);
}
