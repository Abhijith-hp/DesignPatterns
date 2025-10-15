/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.chainofresponsibility;

class MediumPriorityHandler extends Handler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("MEDIUM")) {
            System.out.println("MediumPriorityHandler is handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
