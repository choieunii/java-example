package layout.ans;

import javax.swing.*;
import java.awt.*;

public class RandomLabel extends JFrame {
    public RandomLabel() {
        setTitle("Random Labels");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 200) + 50;
            int y = (int) (Math.random() * 200) + 50;
            //  int z = (int) (Math.random() * 100) + 1;
            JLabel label = new JLabel((int) (Math.random() * 100) + "");
            // label.setLocation(x, y);
            //  label.setSize(20, 20);
            label.setBounds(x, y, 20, 20);
            label.setOpaque(true);
            label.setBackground(Color.blue);
            c.add(label);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomLabel();
    }
}
