/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Game {

    
    private String level;
    private int health;
    private int score;
    
    public void play(String level, int health, int score) {
        this.level = level;
        this.health = health;
        this.score = score;
        
       System.out.println("Playing " + level + " | Health: " + health + " | Score: " + score);
    }
    public GameMemento save(){
       System.out.println("💾 Game Saved at " + level);
       return new GameMemento(level,health,score);
    }
    
    public void restore(GameMemento memento){
        this.level = memento.getLevel();
        this.health = memento.getHealth();
        this.score = memento.getScore();
        System.out.println("♻️ Restored to " + level + " | Health: " + health + " | Score: " + score);
    }
   
    
   
}
