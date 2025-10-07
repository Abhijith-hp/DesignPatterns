/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abhijith.observerdesignpattern;

public class ObserverDesignPattern {

    public static void main(String[] args) {
       YouTubeChannel channel = new YouTubeChannel("TechWithAbhi");

        Observer user1 = new Subscriber("Alice");
        Observer user2 = new Subscriber("Bob");
        Observer user3 = new Subscriber("Charlie");

       
        channel.add(user1);
        channel.add(user2);
        channel.add(user3);

        
        channel.uploadVideo("Design Patterns in Java");

       
        channel.remove(user2);

        channel.uploadVideo("Observer Pattern Explained");
    }
    }

