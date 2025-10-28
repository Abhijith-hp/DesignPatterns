/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.interpreterdesignpattern;


public class DivisionExpression implements Expression {
    
    private Expression left = null;
    private Expression right = null;
    
    
    DivisionExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }
    

    @Override
    public int interpret() {
       return left.interpret() / right.interpret();
    }
    
}

