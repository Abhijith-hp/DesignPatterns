/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.statedesignpattern;


public class HasCardState implements ATMState {
    
    private final ATMMachine atmMachine;
    
    public HasCardState(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
     System.out.println("Card already inserted!");
    }
 @Override
    public void ejectCard() {
       System.out.println("Card ejected.");
       atmMachine.setState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
      if(pin==1234){
          System.out.println("PIN accepted");
          atmMachine.setState(atmMachine.getHasCorrectPinState());
      }else{
          System.out.println("Wrong PIN! Card ejected.");
            atmMachine.setState(atmMachine.getNoCardState());
      }
    }

    @Override
    public void withdrawCash(int amount) {
         System.out.println("Enter PIN first.");
    }
    
}
