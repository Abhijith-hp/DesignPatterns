/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.mavenproject7;


public abstract class Product implements Box {
    
    public String name;
    public int price;
    
    public Product(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    int getPrice(){
        return price;
    }
    
    
}
