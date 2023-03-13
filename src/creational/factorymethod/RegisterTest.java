package creational.factorymethod;

public class RegisterTest {

    public static void main(String[] args) {

        StudentFactory studentFactory = new StudentFactoryImpl();

        Student student = studentFactory.createStudent("İrem");
        System.out.println(student.toString());

        Student businessStudent = studentFactory.createBusinessStudent("Emir", "BMW");
        System.out.println(businessStudent.toString());

        EngineeringStudentFactory engineerStudentFactory = new EngineeringStudentFactoryImpl();

        EngineeringStudent computerStudent = engineerStudentFactory.createComputerEngineeringStudent("Süha Can");
        System.out.println(computerStudent.toString());

        EngineeringStudent electricalEngineeringStudent = engineerStudentFactory.createElectricalEngineeringStudent("Mert");
        System.out.println(electricalEngineeringStudent.toString());
    }
}
