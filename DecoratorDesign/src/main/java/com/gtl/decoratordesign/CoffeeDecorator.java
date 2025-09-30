/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.decoratordesign;

/**
 *
 * @author 20309
 */
public abstract class CoffeeDecorator implements Coffee {
    
    protected Coffee coffee;
    
    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;

    }
 
}
