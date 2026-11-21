package model;

import java.util.ArrayList;
import java.util.List;

public class HeadPlate extends ItemWoW {

    private final List<String> attributes;

    public HeadPlate(String name, String type, String spec, int price) {
        super(name, type, spec, price);

        this.attributes = new ArrayList<>();
        this.attributes.add("Armor +100");
        this.attributes.add("Strength +150");
        this.attributes.add("Stamina +110");

    }

    public List<String> getAttributes() {return attributes;}
}
