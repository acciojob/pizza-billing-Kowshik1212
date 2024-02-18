package com.driver;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
//    System.out.println("Press 1 for Normal Pizza and 2 for Deluxe Pizza");
//    Scanner sc=new Scanner(System.in);
//    int pizzaType = sc.nextInt();
//    System.out.println("Press 1 for veg and 2 for non-veg");
//    int vegOrNonveg = sc.nextInt();
//    boolean isVeg= vegOrNonveg != 2;
//    Pizza p;
//    if(pizzaType==2)
//    {
//      p=new DeluxePizza(isVeg);
//    }
//    else {
//      p=new Pizza(isVeg);
//    }
//    while(true) {
//      System.out.println("Press 1 for Extra Cheese, 2 for Extra Toppings, 3 for Paper Bag and 4 for getting bill");
//      int option = sc.nextInt();
//      if (option == 1) {
//        p.addExtraCheese();
//      } else if (option == 2) {
//        p.addExtraToppings();
//      } else if (option == 3) {
//        p.addTakeaway();
//      } else {
//        System.out.println(p.getBill());
//        break;
//      }
//    }
  }
}