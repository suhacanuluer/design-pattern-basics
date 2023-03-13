package creational.factorymethod;

import java.time.LocalDateTime;

public class EngineeringStudentFactoryImpl implements EngineeringStudentFactory {

    private LocalDateTime now;

    @Override
    public EngineeringStudent createComputerEngineeringStudent(String name) {
        now = LocalDateTime.now();
        return new ComputerEngineeringStudent(name,now, "casio");
    }

    @Override
    public EngineeringStudent createElectricalEngineeringStudent(String name) {
        now = LocalDateTime.now();
        return new ElectricalEngineeringStudent(name, now, "casio");
    }
}
