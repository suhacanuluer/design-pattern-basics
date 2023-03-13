package creational.factorymethod;

public interface StudentFactory {
    Student createStudent(String name);
    Student createBusinessStudent(String name,String car);
}
