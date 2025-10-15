/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.chainofresponsibility;

public abstract class Handler {
    protected Handler nextHandler;
    
    protected void setHandler(Handler handler){
        this.nextHandler = handler;
    }
    
    public abstract void handleRequest(String requestType);
    
}
