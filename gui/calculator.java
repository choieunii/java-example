package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame{

    public calculator()
    {
        this.setTitle("계산기 프레임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();

        c.add(new JPanel1(), BorderLayout.NORTH);
        c.add(new JPanel2(), BorderLayout.CENTER);
        c.add(new JPanel3(), BorderLayout.SOUTH);

        //	this.setLayout(new BorderLayout());

        this.setSize(300,300);//크기
        this.setVisible(true);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new calculator();
    }

    class JPanel1 extends JPanel//jpanel상속
    {
        public JPanel1()
        {
            JLabel label=new JLabel("수식입력");
            JTextField textField=new JTextField();

            this.setBackground(Color.GRAY);
            this.add(label);
            this.add(textField);
        }
    }
    //Layout Default->FlowLayout
    class JPanel2 extends JPanel
    {
        public JPanel2()
        {
            this.setLayout(new GridLayout(5,5,3,3));
            //컨텐트팬의 배치관리자
            JButton btns[]=new JButton[20];
            for(int i=0;i<10;i++)
            {
                btns[i]=new JButton(""+i);
                this.add(btns[i]);
            }

            btns[10]=new JButton("CE");
            btns[11]=new JButton("계산");
            btns[12]=new JButton("+");
            btns[13]=new JButton("-");
            btns[14]=new JButton("x");
            btns[15]=new JButton("/");
            //버튼추가

            for(int i=12;i<16;i++)
            {
                btns[i].setBackground(Color.BLUE);
                //파란색으로
            }
            for(int i=10;i<16;i++)
            {
                this.add(btns[i]);
                //버튼달기
            }
        }
    }
    class JPanel3 extends JPanel
    {
        public JPanel3()
        {
            JLabel label=new JLabel("계산결과");

            JTextField textField=new JTextField(17);

            this.setBackground(Color.YELLOW);
            //노란색으로
            this.add(label);
            this.add(textField);
        }
    }

}
