package graphic;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class O12 extends JFrame {
    static final int MOVEMENT = 10;
    // Move 할 만큼의 상수
    Container c;
    O12() {
        super("문제 2번");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        IPanel ip = new IPanel();
        c.add(ip);

        setSize(400, 400);
        setVisible(true);
        ip.requestFocus();
        // ip 패널에 포커스를 줘야 상하 좌우 움직일수 있음
    }

    class IPanel extends JPanel {
        int x1 = 50, y1 = 50;
        // 초기 clip 좌표 값
        public IPanel() {
            addKeyListener(new MKL());
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon icon = new ImageIcon("images/Tulips.png");
            Image img = icon.getImage();
            g.setClip(x1, y1, 50, 50);
            // (x1,y1) 좌표에 50 X 50 사이즈 Clip 생성
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

            // 문자열 생성 drawing
            g.setColor(Color.yellow);
            g.setFont(new Font("고딕체", Font.ITALIC, 30));
            g.drawString("Helper", 0, 200);
        }

        class MKL extends KeyAdapter {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == e.VK_UP) {
                    y1 -= MOVEMENT;
                    if(y1 < 0) y1 = 0;
                    repaint();
                }

                if (e.getKeyCode() == e.VK_DOWN) {
                    y1 += MOVEMENT;
                    if(y1 > getHeight()) y1 -= 50;
                    repaint();
                }

                if (e.getKeyCode() == e.VK_LEFT) {
                    x1 -= MOVEMENT;
                    if(x1 < 0) x1 = 0;
                    repaint();
                }

                if (e.getKeyCode() == e.VK_RIGHT) {
                    x1 += MOVEMENT;
                    if(x1 > getWidth()) x1 -= 50;
                    repaint();
                }
            }
        }
    }

    public static void main(String args[]) {
        new O12();
    }
}
