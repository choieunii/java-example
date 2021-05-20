package graphic;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

class Circle {
    int x,y,w,h;
    public Circle(int x, int y,int w,int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}


public class varyeun extends JFrame {
    MyPanel panel = new MyPanel();

    public varyeun() {
        setTitle("마우스로 원 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(800,400);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        Vector<Circle> v = new Vector<Circle>();
        int fromx,fromy,tox,toy;
        public MyPanel() {
            setLayout(null);
            addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e) {
                    fromx = e.getX();
                    fromy = e.getY();
                }
                public void mouseReleased(MouseEvent f) {
                    tox = f.getX();
                    toy = f.getY();
                    v.add(new Circle(fromx,fromy,tox,toy));
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for(int i=0;i<v.size();i++) {
                Circle c = v.get(i);
                setForeground(Color.MAGENTA);
                g.drawOval(c.x,c.y,c.w,c.h);
            }
        }
    }

    public static void main(String [] args) {
        new varyeun();
    }
}