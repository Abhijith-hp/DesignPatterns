/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtl.bridgedesign;

/**
 *
 * @author 20309
 */
public class NetFlix extends Video {

    public NetFlix (VideoProcessor videoProcessor){
        super(videoProcessor);
    }
    @Override
    void play() {
        videoProcessor.process();
    }
    
    
}
