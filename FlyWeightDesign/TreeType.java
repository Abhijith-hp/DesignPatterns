/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.flyweight;



// Intrinsic State 
public class TreeType {
    
    private String name;
    private String colour;

    public TreeType(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }
    
    public void draw(int x,int y){
        System.out.println("Drawing the tree "+name+" with "+x+" and "+y);
    }
    
    
    
    
    
}
