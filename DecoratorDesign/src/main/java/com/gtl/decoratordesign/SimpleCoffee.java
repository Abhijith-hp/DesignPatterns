/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.decoratordesign;

/**
 *
 * @author 20309
 */
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public int getPrice() {
        return 10;
    }
    
}
