package com.driver;

public class Pizza {

    private int basePrice;
    private int cheesePrice;
    private int toppingsPrice;
    private int bagPrice;
    private String bill;
    private Boolean isVeg;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isBagAdded;
    boolean isBillGiven;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        cheesePrice = 0;
        toppingsPrice = 0;
        bagPrice = 0;
        bill = "";
        isCheeseAdded = false;
        isToppingsAdded = false;
        isBagAdded = false;
        isBillGiven = false;
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
        if(!isCheeseAdded)
        {
            isCheeseAdded = true;
            cheesePrice+=80;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            isToppingsAdded = true;
            if(isVeg)
            {
                toppingsPrice+=70;
            }
            else {
                toppingsPrice+=120;
            }
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(!isBagAdded)
        {
            isBagAdded = true;
            bagPrice += 20;
        }
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        if(!isBillGiven) {
            isBillGiven = true;
            bill+="Base Price Of The Pizza: "+basePrice+"\n";
            if(cheesePrice!=0)
                bill+="Extra Cheese Added: "+cheesePrice+"\n";
            if(toppingsPrice!=0)
                bill+="Extra Toppings Added: "+toppingsPrice+"\n";
            if(bagPrice!=0)
                bill+="Paperbag Added: "+bagPrice+"\n";
            bill+="Total Price: "+getPrice()+"\n";
            return this.bill;
        }
        else
            return "";
    }
}
