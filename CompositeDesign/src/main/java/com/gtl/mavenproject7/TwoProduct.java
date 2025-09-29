/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.mavenproject7;




public class TwoProduct extends Product {

    public TwoProduct(String name,int price){
        super(name,price);
    }
    @Override
    public int calculatePrice() {
       return getPrice();
    }

   
    
    
}
