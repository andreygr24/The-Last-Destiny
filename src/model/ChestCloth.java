package model;

import java.util.ArrayList;
import java.util.List;

public class ChestCloth extends ItemWoW {

    private final List<String> attributes;

    public ChestCloth(String name, String type, String spec, int price) {
        super(name, type, spec, price);

        this.attributes = new ArrayList<>();
        this.attributes.add("Spirit +150");
        this.attributes.add("Stamina +250");
        this.attributes.add("Power Spell +550");

    }

    public List<String> getAttributes() {return attributes;}
}
