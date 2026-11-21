package model;

import java.util.ArrayList;
import java.util.List;

public class WristCloth extends ItemWoW{

    private final List<String> attributes;

    public WristCloth(String name, String type, String spec, int price) {
        super(name, type, spec, price);

      this.attributes = new ArrayList<>();
      this.attributes.add("Power Spell +330");
      this.attributes.add("Intellect +100");
      this.attributes.add("Stamina +450");

    }

    public List<String> getAttributes() {return attributes;}
}
