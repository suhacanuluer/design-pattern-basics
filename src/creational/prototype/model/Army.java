package creational.prototype.model;

import creational.prototype.common.ColorEnum;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Army {

    private String name;

    private List<Warrior> warriors;

    private ColorEnum color;

    public Army(String name, ColorEnum color) {
        this.name = name;
        this.warriors = new ArrayList<>();
        this.color = color;
    }
}
