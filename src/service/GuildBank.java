package service;

import model.Sellable;
import util.Currency;
import util.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GuildBank {

     private final List<Sellable> bank;

     public GuildBank(){

          this.bank = new ArrayList<>();
     }

     int selectItem = -1;
     int buyItem = -1;
     int quantity = -1;

public void showBank() {

     IntStream.range(0, bank.size())
             .forEach(i -> System.out.println(i + " - " + bank.get(i).getName() + " - " + Currency.currency.format(bank.get(i).getPrice())));

     do{
          try {
               System.out.println("Choose the item you want to buy: ");
               selectItem = Integer.parseInt(Input.sc.nextLine());
               if (selectItem < 0 || selectItem >= bank.size()) {
                    System.out.println("Write correct number!");
               }

          }catch (Exception error){
               System.out.println("Only number allowed");
               selectItem = -1;
          }
     }while (selectItem < 0 || selectItem >= bank.size());





     }

}
