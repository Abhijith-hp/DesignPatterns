/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.abhijith.visitordesignpattern;


public interface Operation {
    void visit(NumberExpression number);
    void visit(AddExpression add);
    void visit(SubtractExpression sub);
}
