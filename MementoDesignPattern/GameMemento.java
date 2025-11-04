/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class GameMemento {
  
    private final String level;
    private final int health;
    private final int score;

    public String getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public GameMemento(String level, int health, int score) {
        this.level = level;
        this.health = health;
        this.score = score;
    }
    
    
}
