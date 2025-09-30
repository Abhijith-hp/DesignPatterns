/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gtl.decoratordesign;

/**
 *
 * @author 20309
 */
public class DecoratorDesign {

    public static void main(String[] args) {
        Coffee coffee = new HoneyCoffee(new SugarCoffee(new SimpleCoffee()));
        System.out.println(coffee.getDescription());
         System.out.println(coffee.getPrice());
        
    }
}
