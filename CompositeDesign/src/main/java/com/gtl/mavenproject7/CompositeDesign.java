/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gtl.mavenproject7;

/**
 *
 * @author 20309
 */
public class CompositeDesign {

    public static void main(String[] args) {
       DeliveryService deliveryService = new DeliveryService();
       
       deliveryService.setOrder(new CompositeBox(
               new CompositeBox(new OneProduct("Apple",50))),new TwoProduct("Orange",70));
       
        System.out.println("The total price "+ deliveryService.calculatePrice());
    }
}
