package model;

public class Members {

    private String name;
    private String wowClass;
    private boolean active;
    private String rank;

    public Members(String name, String wowClass, boolean active, String rank){

        this.name = name;
        this.active = active;
        this.wowClass = wowClass;
        this.rank = rank;

    }

    public String getName() {return name;}

    public boolean getActive() {return active;}

    public String getRank() {return rank;}

    public String getWowClass() {return wowClass;}
}
