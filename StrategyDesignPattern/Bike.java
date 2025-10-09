/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.strtegydesignpattern;

public class Bike implements TravelStrategy{

    @Override
    public void execute(String destination) {
       System.out.println("Traveled all way to "+destination+" by bike");
    }
    
}
