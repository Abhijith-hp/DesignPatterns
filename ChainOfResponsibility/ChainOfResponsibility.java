/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abhijith.chainofresponsibility;


public class ChainOfResponsibility {

    public static void main(String[] args) {
        Handler low = new LowPriorityHandler();
        Handler medium = new MediumPriorityHandler();
        Handler high = new HighPriorityHandler();

       
        low.setHandler(medium);
        medium.setHandler(high);

      
        low.handleRequest("LOW");
        low.handleRequest("MEDIUM");
        low.handleRequest("HIGH");
        low.handleRequest("UNKNOWN"); 
    }
    }
