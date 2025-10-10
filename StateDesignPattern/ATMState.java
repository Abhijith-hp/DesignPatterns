/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.abhijith.statedesignpattern;


public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawCash(int amount);
}
