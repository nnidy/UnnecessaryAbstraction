package solution;

import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;

class ButtonTest {

      private JButton createColoredButton(String text, Color color) {
           JButton button = new JButton(text);
           button.setBackground(color);
           return button;
        }

    void test() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300, 200);
        
        JButton button =  createColoredButton(“Submit”, Color.BLUE);

        frame.add(button);
        
        try{Thread.sleep(3000);}
        catch(InterruptedException e){}
    }
}


