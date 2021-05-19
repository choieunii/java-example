package layout;

import javax.swing.*;
import java.awt.*;

class GBTest {
    JFrame frame;
    JButton btn;
    GridBagConstraints gbc;
    Insets insets = new Insets(0, 0, 0, 0);

    GBTest() {
        frame = new JFrame("GridBag Test");
        frame.setLayout(new GridBagLayout());
        //Button one insert
        btn = new JButton("One");
        addBtn(btn, 0,0,2,1);

        //Button two insert
        btn = new JButton("Two");
        addBtn(btn, 0,1,1,1);
        //Button three insert
        btn = new JButton("Three");
        addBtn(btn, 1,1,1,1);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GBTest();
    }

    private void addBtn(JButton btn, int x, int y, int widthX, int widthY) {
        gbc = new GridBagConstraints(x,y, widthX,widthY, 1.0, 1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                insets, 0, 0);
        //
        frame.add(btn, gbc);
    }
}

