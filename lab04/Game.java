public class Game implements World {
    
   
  public static void main(String[] args) {
    BigBang b = new BigBang(new Game()); 
    // b.start(..., ...); 
    System.out.println( b ); 
  }
}