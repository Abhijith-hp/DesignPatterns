/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.statedesignpattern;


public class ATMMachine {
 private final ATMState noCardState;
 private final ATMState hasCardState;
 private final ATMState hasCorrectPinState;
 
 private ATMState currentState;
 public int cashAvailable = 2000;
 
 public ATMMachine(){
     noCardState = new NoCardState(this);
     hasCardState = new HasCardState(this);
     hasCorrectPinState = new HasCorrectPinState(this);
     currentState = noCardState;
         
 }
 public void setState(ATMState state){
     currentState = state;
 }
 
 public ATMState getNoCardState() { return noCardState; }
 public ATMState getHasCardState() { return hasCardState; }
 public ATMState getHasCorrectPinState() { return hasCorrectPinState; }
 
 
  public void insertCard() { currentState.insertCard(); }
  public void ejectCard() { currentState.ejectCard(); }
  public void enterPin(int pin) { currentState.enterPin(pin); }
  public void withdrawCash(int amount) { currentState.withdrawCash(amount); }
 

}
