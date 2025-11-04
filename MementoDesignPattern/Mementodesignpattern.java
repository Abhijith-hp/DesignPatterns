/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */




public class Mementodesignpattern {

    public static void main(String[] args) {
        Game game = new Game();
        SaveManager saveManager = new SaveManager();
        
        game.play("Level 1",100,500);
        saveManager.save(game.save());
        
        game.play("Level 2", 75, 800);
        saveManager.save(game.save());

        game.play("Level 3", 40, 1200); 

       
        game.restore(saveManager.undo());

        game.restore(saveManager.undo());
        
    }
}
