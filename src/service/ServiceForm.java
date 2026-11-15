package service;

import model.Form;

public class ServiceForm {
    public Form createForm (String name, String email, String country, int age){

        try {
            return new Form(name, email, country, age);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
