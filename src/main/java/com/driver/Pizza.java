package com.driver;

public class Pizza {

    private int basePrice;
    private int cheesePrice;
    private int toppingsPrice;
    private int bagPrice;
    private String bill;
    private Boolean isVeg;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        cheesePrice = 0;
        toppingsPrice = 0;
        bagPrice = 0;
        bill = "";
        if(isVeg)
            basePrice = 300;
        else
            basePrice = 400;
        // your code goes here
    }

    public int getPrice(){
        return basePrice + cheesePrice + toppingsPrice + bagPrice;
    }

    public void addExtraCheese(){
        cheesePrice+=80;
        // your code goes here
    }

    public void addExtraToppings(){
        if(isVeg)
        {
            toppingsPrice+=70;
        }
        else {
            toppingsPrice+=120;
        }
        // your code goes here
    }

    public void addTakeaway(){
        bagPrice += 20;
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        bill+="Base Price Of The Pizza: "+basePrice+"\n";
        bill+="Extra Cheese Added: "+cheesePrice+"\n";
        bill+="Extra Toppings Added: "+toppingsPrice+"\n";
        bill+="Paperbag Added: "+bagPrice+"\n";
        bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
}
