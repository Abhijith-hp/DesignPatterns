/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.adapterdesign;

/**
 *
 * @author 20309
 */
public class GroceryProduct implements GroceryItem {
   
    private String name;
    private String storeName;
    
    public GroceryProduct(String name,String storeName){
        this.name = name;
        this.storeName=storeName;
    }
    
    @Override
    public void getName() {
        System.out.println("The name of Item is"+ name);  
    }
    @Override
    public void getStoreName() {
        System.out.println("The famous store of this item is "+storeName);
    
    }
    
}
