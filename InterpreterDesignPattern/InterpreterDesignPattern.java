/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abhijith.interpreterdesignpattern;

import java.util.Scanner;


public class InterpreterDesignPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression (e.g., 5 + 10 - 3 + 2): ");
        String expression = sc.nextLine(); 
        
        if (expression.isEmpty()) {
            System.out.println("Error: Expression cannot be empty.");
            return;
        }

        if (!expression.matches("[0-9+\\-*/\\s]+")) {
            System.out.println(" Error: Expression contains invalid characters. Only numbers, '+', '-','/','*' are allowed.");
            return;
        }

        if (expression.startsWith("+") || expression.startsWith("-") || expression.endsWith("+") || expression.endsWith("-")) {
            System.out.println("❌ Error: Expression cannot start or end with an operator.");
            return;
        }

        Expression exp = ExpressionParser.parse(expression);
        System.out.println(expression + " = " + exp.interpret());
        sc.close();
    }
}
