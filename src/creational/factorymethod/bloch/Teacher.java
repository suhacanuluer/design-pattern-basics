package creational.factorymethod.bloch;

import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class Teacher {

    private String name;
    private LocalDateTime createDate;
    private String divisions;

    private Teacher(String name, LocalDateTime createDate, String divisions) {
        this.name = name;
        this.createDate = createDate;
        this.divisions = divisions;
    }

    public static Teacher createTeacher(String name) {
        // varsayalım ki bölümü olmayan tüm öğretmenler sınıf öğretmeni
        return new Teacher(name, LocalDateTime.now(), "Sınıf Öğretmeni");
    }

    public static Teacher createTeacherWithDivision(String name, String divisions) {
        return new Teacher(name, LocalDateTime.now(), divisions);
    }
}
