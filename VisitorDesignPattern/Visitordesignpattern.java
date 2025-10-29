/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abhijith.visitordesignpattern;


public class Visitordesignpattern {

    public static void main(String[] args) {
        
     Expression expr = new AddExpression(new NumberExpression(5),new NumberExpression(6));
     ExpressionEvaluation evaluation = new ExpressionEvaluation();
     expr.accept(evaluation);
     System.out.println("The result is "+ evaluation.getResults());
     
     
     
    }
}
