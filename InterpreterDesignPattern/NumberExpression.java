/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.interpreterdesignpattern;


public class NumberExpression implements Expression {

    
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

   
    
    @Override
    public int interpret() {
       return number;
       
    }
    
}
