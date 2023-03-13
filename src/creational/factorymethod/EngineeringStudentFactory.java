package creational.factorymethod;

public interface EngineeringStudentFactory {

    EngineeringStudent createComputerEngineeringStudent(String name);
    EngineeringStudent createElectricalEngineeringStudent(String name);
}
