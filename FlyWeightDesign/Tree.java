/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhijith.flyweight;

//Context
public class Tree {
    
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }
    
    public void draw(){
        treeType.draw(x,y);
    }  

   
    
    
}
