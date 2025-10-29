/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.visitordesignpattern;


public class SubtractExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public SubtractExpression(Expression leftExpression,Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

   public Expression getLeft() {
        return leftExpression;
    }

    public Expression getRight() {
        return rightExpression;
    }

    @Override
    public void accept(Operation operation) {
       operation.visit(this);
    }
    
    
   
}
