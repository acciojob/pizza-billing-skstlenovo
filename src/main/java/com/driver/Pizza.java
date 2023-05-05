package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isBagAdded=false;
        this.isCheeseAdded=false;
        this.isBillGenerated=false;
        this.isToppingAdded=false;
        this.bill="";
        if(isVeg)
        {
            this.price=300;
            this.topping=70;
        }
        else
        {
            this.price=400;
            this.topping=120;
        }
        this.cheese=80;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded)
        {
            this.price+=this.cheese;
            this.isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded)
        {
            this.price+=this.topping;
            this.isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isBagAdded)
        {
            this.price+=20;
            this.isBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded)
            {
                this.bill +="Extra Cheese Added: "+this.cheese+ "\n";
            }
            if(isToppingAdded)
            {
                this.bill+="Extra Topping Added: "+this.topping+ "\n";
            }
            if(isBagAdded)
            {
                this.bill+="Paperbag Added: 20"+ "\n";
            }
            this.bill +="Total Price: "+getPrice()+"\n";
            this.isBillGenerated =true;
        }
        return this.bill;
    }
}
