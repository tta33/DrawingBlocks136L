/* CS136L Lab 2: Drawing Blocks by Tyler Allen and Justin Coffey
*/

import javax.swing.JFrame;
import java.awt.Color;

public class BlocksViewer{
  public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.setSize(10*20, 36*20);
    frame.setTitle("Tretis");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.GRAY);
    frame.setVisible(true);


  }
}
