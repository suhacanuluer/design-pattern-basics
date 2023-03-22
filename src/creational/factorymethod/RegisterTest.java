package creational.factorymethod;

public class RegisterTest {

    public static void main(String[] args) {

        BusinessStudentFactory businessStudentFactory = new BusinessStudentFactoryImpl();

        Student businessStudent = businessStudentFactory.createBusinessStudent("Emir", "BMW");
        System.out.println(businessStudent.toString());

        EngineeringStudentFactory engineerStudentFactory = new EngineeringStudentFactoryImpl();

        EngineeringStudent computerStudent = engineerStudentFactory.createComputerEngineeringStudent("Süha Can");
        System.out.println(computerStudent.toString());

        EngineeringStudent electricalEngineeringStudent = engineerStudentFactory.createElectricalEngineeringStudent("Mert");
        System.out.println(electricalEngineeringStudent.toString());
    }
}
