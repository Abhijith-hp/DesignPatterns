/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.flyweight;

import java.util.HashMap;


public class FlyWeightFactory {
    private static final HashMap<String,TreeType> treetypes = new HashMap<>();
    
    public static TreeType getTreeTypes(String name,String color){
        String key = name+color;
        if(treetypes.containsKey(key))
            return treetypes.get(key);
        TreeType treeType = new TreeType(name,color);
        treetypes.put(key, treeType);
        return treeType;
        
    }
}
