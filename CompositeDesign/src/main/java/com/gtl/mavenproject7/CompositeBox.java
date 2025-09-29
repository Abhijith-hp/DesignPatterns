/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.mavenproject7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CompositeBox implements Box {
    
    private final List<Box> childrens = new ArrayList();
    
    public CompositeBox(Box... boxes){
        childrens.addAll(Arrays.asList(boxes));
    }

    @Override
    public int calculatePrice() {
        return childrens.stream().mapToInt(Box::calculatePrice).sum();
        
    }
    
}
