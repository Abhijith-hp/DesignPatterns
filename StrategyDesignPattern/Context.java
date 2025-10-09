/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.strtegydesignpattern;


public class Context {
  private TravelStrategy travelStrategy;

  public Context(TravelStrategy travelStrategy){
      this.travelStrategy = travelStrategy;
  } 
  
  public void travel(String destination){
      travelStrategy.execute(destination);
  }
}
