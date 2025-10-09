/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abhijith.strtegydesignpattern;


public class Strategydesignpattern {

    public static void main(String[] args) {
     Context bikeTravelContext = new Context(new Bike());
     Context carTravelContext = new Context(new Car());
     bikeTravelContext.travel("UK");
     carTravelContext.travel("USA");
     
     
    }
}
