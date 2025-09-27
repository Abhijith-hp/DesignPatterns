/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gtl.bridgedesign;

/**
 *
 * @author 20309
 */
public class BridgeDesign {

    public static void main(String[] args) {
       Video youtubeVideo = new Youtube(new FourKrocessor());
       youtubeVideo.play();
       
       Video netflixVideo = new NetFlix(new UHDProcessor());
       netflixVideo.play();
    }
}
