package creational.factorymethod.bloch;

public class TeacherTest {
    public static void main(String[] args) {

        Teacher mathTeacher = Teacher.createTeacherWithDivision("Berna","Math");
        Teacher englishTeacher = Teacher.createTeacherWithDivision("Diren","English");
        Teacher teacher = Teacher.createTeacher("Sebiha");

        System.out.println(mathTeacher.toString());
        System.out.println(englishTeacher.toString());
        System.out.println(teacher.toString());
    }
}
