package model;

import java.util.ArrayList;
import java.util.List;

public class PantsPlate extends ItemWoW {

    private final List<String> attributes;

    public PantsPlate(String name, String type, String spec, int price) {
        super(name, type, spec, price);

    this.attributes = new ArrayList<>();
    this.attributes.add("Armor +220");
    this.attributes.add("Stamina +480");
    this.attributes.add("Strength +550");

    }

    public List<String> getAttributes() {return attributes;}
}
