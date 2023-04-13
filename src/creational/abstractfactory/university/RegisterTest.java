package creational.abstractfactory.university;

import creational.factorymethod.university.Student;

public class RegisterTest {
    public static void main(String[] args) {
        UniversityFactory adanaUniversityFactory = new AdanaUniversityFactory();

        Rector adanaRector = adanaUniversityFactory.createRector("AHMET");
        Student adanaBusinessStudent = adanaUniversityFactory.createBusinessStudent("EMIR", "BMW");
        Student adanaComputerStudent = adanaUniversityFactory.createComputerEngineeringStudent("SÜHA CAN");
        Student adanaElectricalStudent = adanaUniversityFactory.createElectricalEngineeringStudent("MERT");

        UniversityFactory mersinUniversityFactory = new AdanaUniversityFactory();
        Rector mersinRector = mersinUniversityFactory.createRector("MEHMET");
        Student mersinBusinessStudent = mersinUniversityFactory.createBusinessStudent("İREM", "MERCEDES");
        Student mersinComputerStudent = mersinUniversityFactory.createComputerEngineeringStudent("MUSTAFA");
        Student mersinElectricalStudent = mersinUniversityFactory.createElectricalEngineeringStudent("KEMAL");

    }
}
