/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.decoratordesign;

/**
 *
 * @author 20309
 */
public class SugarCoffee extends CoffeeDecorator {
    
    SugarCoffee(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+"Sugar";
    }

    @Override
    public int getPrice() {
       return coffee.getPrice() + 20;
    }
    
}
