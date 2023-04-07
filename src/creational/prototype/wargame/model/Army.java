package creational.prototype.wargame.model;

import creational.prototype.wargame.common.ColorEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//@Data
@Getter
@Setter
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
