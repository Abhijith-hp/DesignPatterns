
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class SaveManager {
    
    private Stack<GameMemento> saves = new Stack<>();
    
    public void save(GameMemento memento){
        saves.push(memento);
    }
    
    public GameMemento undo(){
        if(!saves.empty()){
            System.out.println("Undoing last move...");
            return saves.pop();
            
        }
        System.out.println("No save found!");
        return null;
    }
}
