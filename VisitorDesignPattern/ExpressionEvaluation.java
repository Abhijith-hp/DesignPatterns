/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.visitordesignpattern;


public class ExpressionEvaluation implements Operation {
    
    private int result;
    
    public int getResults(){
        return result;
    }

    @Override
    public void visit(NumberExpression number) {
       result  = number.getNumber();
    }

    @Override
    public void visit(AddExpression add) {
        add.getLeft().accept(this);
        int left = result;
        add.getRight().accept(this);
        int right = result;
        result = left+right;
    }

    @Override
    public void visit(SubtractExpression sub) {
        sub.getLeft().accept(this);
        int left = result;
        sub.getRight().accept(this);
        int right = result;
        result = left-right;
    }
    
}
