package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg); // call for constructor of parent class ie. pizza class...
        // when it is exucuted the normal pizzaa is created...
        // bt q says.. delux pizza is the  normal pizza + extra cheese + extra topings...
        // your code goes here

        addExtraCheese();
        addExtraToppings();

        //  super.addExtraCheese();                 call for parent class methods
        //  super.addExtraToppings();               ...also correct

        //  this.addExtraCheese();
        //  this.addExtraToppings();                  ... also correct
        // this >>> reffers current class
        // super >>> reffers to parent class



        // to make normal pizza to delux one..we r adding extra cheese and extra topings in pizza

    }
}