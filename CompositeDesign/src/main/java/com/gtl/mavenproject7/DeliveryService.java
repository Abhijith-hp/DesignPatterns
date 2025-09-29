/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.mavenproject7;

/**
 *
 * @author 20309
 */
public class DeliveryService {
    
    private Box box;
    
    public void setOrder(Box... boxes){
        this.box = new CompositeBox(boxes);
    }
    
    public int calculatePrice(){
        return box.calculatePrice();
    }
    
}
