import java.awt.*;
import javax.swing.*;


 public class Window {
 
 public static void main(String[] args) {
 
JFrame frame = new JFrame("felight");//new window

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit

JLabel text = new JLabel("Felight Rocks",SwingConstants.CENTER);//text 

text.setPreferredSize(new Dimension(300,300));//dimensions

frame.getContentPane().add(text,BorderLayout.CENTER);//inserting text into window

frame.setLocationRelativeTo(null);//center the screen

frame.pack();//auto resize the window

frame.setVisible(true);//show the window


}
}
