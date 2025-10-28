/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.interpreterdesignpattern;

import java.util.Stack;


public class ExpressionParser {
  
    public static Expression parse(String str){
        Stack<Expression> stack = new Stack<>();
        String[] tokens = str.split(" ");
        Expression left,right;
        
        for(int i=0;i<tokens.length;i++){
            String token  = tokens[i];
            switch(token){
                case "+":
                    right = new NumberExpression(Integer.parseInt(tokens[++i]));
                    left = stack.pop();
                    stack.push(new AddExpression(left,right));
                    break;
                case "-":
                    right = new NumberExpression(Integer.parseInt(tokens[++i]));
                    left = stack.pop();
                    stack.push(new SubtractExpression(left,right));
                    break;
                    
                case "*":
                    right = new NumberExpression(Integer.parseInt(tokens[++i]));
                    left = stack.pop();
                    stack.push(new MultiplicationExpression(left,right));
                    break;
                case "/":
                    right = new NumberExpression(Integer.parseInt(tokens[++i]));
                    left = stack.pop();
                    stack.push(new DivisionExpression(left,right));
                    break;
                default:
                     stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop();
        
    }
}
