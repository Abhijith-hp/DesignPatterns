/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.statedesignpattern;

public class HasCorrectPinState implements ATMState {
    
    private final ATMMachine atmMachine;
    
    public HasCorrectPinState(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
       System.out.println("Transaction already in progress.");
    }
 @Override
    public void ejectCard() {
       System.out.println("Card ejected.");
        atmMachine.setState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
       System.out.println("PIN already entered.");    }

    @Override
    public void withdrawCash(int amount) {
        if (amount > atmMachine.cashAvailable) {
            System.out.println("Not enough cash in ATM!");
            System.out.println("Card ejected.");
            atmMachine.setState(atmMachine.getNoCardState());
        } else {
            System.out.println("Dispensed ₹" + amount);
            atmMachine.cashAvailable -= amount;
            System.out.println("Card ejected.");
            atmMachine.setState(atmMachine.getNoCardState());
        }
    }
    
}
