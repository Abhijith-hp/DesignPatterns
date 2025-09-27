/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.bridgedesign;

/**
 *
 * @author 20309
 */
abstract class Video {
    
    protected VideoProcessor videoProcessor;
    
    public Video(VideoProcessor videoProcessor){
        this.videoProcessor = videoProcessor;
    }
    abstract void play();
        
    
}
