package creational.prototype.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Army {

    private List<Warrior> warriors;
    private String color;

    public Army(String color) {
        this.warriors = new ArrayList<>();
        this.color = color;
    }
}
