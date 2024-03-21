package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class SplashMain extends JFrame {
     SplashMain() {
         ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/alian.gif"));

         Image image = imageIcon.getImage().getScaledInstance(858,680,Image.SCALE_DEFAULT);
         ImageIcon imageIcon1 = new ImageIcon(image);

         JLabel label = new JLabel(imageIcon1);
         label.setBounds(0,0,858,680);
         add(label);

         setLayout(null);
         setLocation(300,80);
        setSize(858,680);
        setVisible(true);

         try {
             Thread.sleep(5000);
             new Login();
             setVisible(false);
         } catch (Exception e) {
             e.printStackTrace();
         }
    }

    public static void main(String[] args) {
        new SplashMain();
    }
}
