import java.awt.Graphics; 

public class Game implements World {
  public Game() { // initial state 
    System.out.println("Game has been created.");  
  }
  public void teh() { // what do I do when time passes 
    
  }
  public void draw(Graphics g) { // render yourself you are World 
      
  }
  public static void main(String[] args) {
    BigBang b = new BigBang(new Game()); 
    // b.start(..., ...); 
    System.out.println( b ); 
  }
}