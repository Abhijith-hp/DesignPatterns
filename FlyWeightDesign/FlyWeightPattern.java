/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abhijith.flyweight;


public class FlyWeightPattern {

    public static void main(String[] args) {
       TreeType oakTreeType = FlyWeightFactory.getTreeTypes("oak", "green");
       TreeType mangoTreeType = FlyWeightFactory.getTreeTypes("mango", "yellow");
       
       Tree oakTree = new Tree(2,3,oakTreeType);
       Tree mangoTree = new Tree(4,5,mangoTreeType);
       
       oakTree.draw();
       mangoTree.draw();
       
    }
}
