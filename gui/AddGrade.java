package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGrade implements ActionListener {
    JFrame frame;
    JLabel lName, lMath, lEng, lJava;
    JButton savebtn;
    Insets insets = new Insets(1,1,1,1);
    JTextField tfName, tfMath, tfEng, tfJava;
    GridBagConstraints gbc;

    public AddGrade() {

    }

    public AddGrade(Main m) {
        frame = new JFrame("성적입력");
        frame.setLayout(new GridBagLayout());
        lName = new JLabel("학생이름:");
        addComponent(lName, 0,0,1,1);
        tfName = new JTextField(10);
        addComponent(tfName,1,0,1,1);

        lMath=new JLabel("수학");
        tfMath=new JTextField(10);
        addComponent(lMath,0,1,1,1);
        addComponent(tfMath,1,1,1,1);

        lEng=new JLabel("영어");
        tfEng=new JTextField(10);
        addComponent(lEng,0,2,1,1);
        addComponent(tfEng,1,2,1,1);

        lJava=new JLabel("자바");
        tfJava=new JTextField(10);
        addComponent(lJava,0,3,1,1);
        addComponent(tfJava,1,3,1,1);

        savebtn= new JButton("저장");
        addComponent(savebtn, 0,4,1,1);

        savebtn.addActionListener(this);

        frame.setSize(300,500);
        frame.setVisible(true);
        frame.setLocation(100,100);

    }

    public static void main(String[] args) {
        new AddGrade();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==savebtn) {
            String name = tfName.getText();
            String math = tfMath.getText();
            String eng = tfEng.getText();
            String java = tfJava.getText();
            new Main(this, name,Integer.parseInt(math),
                    Integer.parseInt(eng),
                    Integer.parseInt(java));
            frame.dispose();
        }
    }


    private void addComponent(JComponent c, int x, int y, int w, int h) {
        gbc = new GridBagConstraints(x,y,w,h,1.0,1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,insets, 0, 0);
        frame.add(c, gbc);
    }
}
