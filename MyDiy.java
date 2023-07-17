
package javaapplication149;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MyDiy extends JFrame{
    
    public MyDiy(){
        setTitle("Bathabile Mkhabela");
        setSize(100, 150);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.red);
        setBackground(Color.BLUE);
        setVisible(true);
    }
    
}
