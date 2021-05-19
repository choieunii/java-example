package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class Std implements Student {
    String name;
    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getScore(int score) {
        return score;
    }

}

class UniStudent extends Std {

    int mathScore;
    int englishScore;
    int javaScore;

    public int getMathScore() {
        return getScore(mathScore);
    }

    public int getEnglishScore() {
        return getScore(englishScore);
    }

    public int getJavaScore() {
        return getScore(javaScore);
    }

    public void setName(String name) {
        super.name=name;
    }

    public void setScore(int math, int english, int java){
        mathScore=math;
        englishScore=english;
        javaScore=java;
    }
}

public class Main implements ActionListener {
    static int num_std=0;
    static UniStudent[] uniStd = new UniStudent[100];
    JFrame frame;
    JButton insertbtn, searchbtn;
    GridBagConstraints gbc;
    Insets insets = new Insets(0,0,0,0);
    JScrollPane jpane;
    JTable jtable;
    Vector columns = null;

    public Main() {
        if(columns==null) {
            columns=new Vector();
            columns.add("이름");
            columns.add("수학");
            columns.add("영어");
            columns.add("자바");
        }
        createUI();
    }

    public Main(AddGrade ag, String name, int math, int eng, int java) {
        uniStd[num_std]=new UniStudent();
        uniStd[num_std].setName(name);
        uniStd[num_std++].setScore(math,eng,java);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==insertbtn) {
            new AddGrade(this);
        }
        else if(e.getSource()==searchbtn) {


            frame.remove(jtable);
            frame.remove(jpane);
            columns=new Vector();
            columns.add("이름");
            columns.add("수학");
            columns.add("영어");
            columns.add("자바");

            Vector data = new Vector();

            for(int i=0; i<num_std; i++) {
                Vector row = new Vector();
                row.add(uniStd[i].getName());
                row.add(uniStd[i].getMathScore());
                row.add(uniStd[i].getMathScore());
                row.add(uniStd[i].getMathScore());
                data.add(row);
            }

            jtable=new JTable(data, columns);
            jpane= new JScrollPane(jtable);

            addComponent(jpane,0,1,2,10);
            frame.setVisible(true);

        }
    }

    public void createUI(){
        frame = new JFrame("성적관리 프로그램");
        frame.setLayout(new GridBagLayout());
        insertbtn = new JButton("성적입력");
        addComponent(insertbtn,0,0,1,1);
        searchbtn = new JButton("전체성적조회");
        addComponent(searchbtn, 1,0,1,1);
        insertbtn.addActionListener(this);
        searchbtn.addActionListener(this);

        Vector data = new Vector();
        Vector row = new Vector();
        data.add(row);
        jtable = new JTable(data, columns);
        jpane= new JScrollPane(jtable);
        addComponent(jpane, 0,1,2,2);

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    private void addComponent(JComponent c, int x, int y, int w, int h) {
        gbc = new GridBagConstraints(x,y,w,h,1.0,1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,insets, 0, 0);
        frame.add(c, gbc);
    }
}