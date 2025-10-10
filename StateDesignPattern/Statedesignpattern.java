/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abhijith.statedesignpattern;


public class Statedesignpattern {

    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(500);
        
    }
}
