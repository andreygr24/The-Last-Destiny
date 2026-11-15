package model;

public class Form {

    private final String name;
    private final String email;
    private final String country;
    private final int age;

    public Form(String name, String email, String country, int age){

    if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Please enter a valid Name.");
    }

    if (email == null || email.trim().isEmpty() || !email.contains("@")){
        throw new IllegalArgumentException("Please enter a valid Email");
    }

    if (age < 15){
        throw new IllegalArgumentException("You must be 15+");
    }

        this.name = name;
        this.email = email;
        this.country = country;
        this.age = age;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public String getCountry() {return country;}

    public String getEmail() {return email;}

}
