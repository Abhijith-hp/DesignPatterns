/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.adapterdesign;

/**
 *
 * @author 20309
 */
public class FoodItem implements Item {
    
    private String name;
    private String restaurant;
    
    public FoodItem(String name,String restaurant){
        this.name = name;
        this.restaurant =restaurant;
        
    }

    @Override
    public void getName() {
      System.out.println("The name of Item is"+ name);  
    }
    @Override
    public void getRestaurant() {
        System.out.println("The famous restaurant of this item is "+restaurant);
    }
    
}
