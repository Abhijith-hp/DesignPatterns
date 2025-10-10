/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.statedesignpattern;

/**
 *
 * @author 20309
 */
public class NoCardState implements ATMState {
    
    private final ATMMachine atmMachine;
    
    public NoCardState(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
      System.out.println("Card inserted successfully");
      atmMachine.setState(atmMachine.getHasCardState());
    }
 @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Insert card first.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Insert card first.");
    }
    
}
