import javax.swing.JFrame;
import java.awt.Graphics; 

public class Game implements World {
  public Game() { // initial state 
    System.out.println("Game has been created.");  
  }
  public void teh() { // what do I do when time passes 
    
  }
  public void draw(Graphics g) { // render yourself you are World 
    g.drawString("Welcome to Ripples.", 100, 100); 
  }
  public static void main(String[] args) {
    BigBang b = new BigBang(new Game()); // pass initial state of the world
    JFrame f = new JFrame(); 
    f.setVisible(true); 
    f.setSize(400, 400);
    b.start(300, f); 
  }
}