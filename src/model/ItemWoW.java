package model;

    public abstract class ItemWoW implements Sellable {

    protected String name;
    protected String type;
    protected String spec;
    protected int price;

    public ItemWoW(String name, String type, String spec, int price){

    this.name = name;
    this.type = type;
    this.spec = spec;
    this.price = price;

    }

    public String getName() {return name;}
    public String getType() {return type;}
    public String getSpec() {return spec;}
    public int getPrice() {return price;}

        @Override
        public int getSell() {return price;}


}
