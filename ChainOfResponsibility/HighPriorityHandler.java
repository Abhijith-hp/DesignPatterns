/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.chainofresponsibility;

class HighPriorityHandler extends Handler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("HIGH")) {
            System.out.println("HighPriorityHandler is handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
