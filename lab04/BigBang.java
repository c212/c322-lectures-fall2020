import java.awt.Graphics; 
import java.awt.Container; 
import javax.swing.JComponent; 
import javax.swing.JFrame; 

public class BigBang extends JComponent {
  World world; 
  public BigBang(World world) {
    this.world = world;     
  }
  public void start(int time, JFrame f) { 
    Container c = f.getContentPane();
    c.add(this);   
  } 
  public void paintComponent(Graphics g) {
    this.world.draw(g);     
  }
}