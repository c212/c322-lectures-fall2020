import java.awt.Graphics; 
import java.awt.Container; 
import javax.swing.JComponent; 
import javax.swing.JFrame; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.Timer; 

public class BigBang extends JComponent implements ActionListener {
  World world; 
  Timer timer;
  public BigBang(World world) {
    this.world = world;     
  }
  public void start(int time, JFrame f) { 
    Container c = f.getContentPane();
    c.add(this);   
    this.timer = new Timer(time, this); 
    this.timer.start(); 
  } 
  public void paintComponent(Graphics g) {
    this.world.draw(g);     
  }
  int count; 
  public void actionPerformed(ActionEvent e) {
    System.out.println( this.count++ );     
  }
}