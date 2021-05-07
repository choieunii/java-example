package layout;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("Null Container Sample"); //프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
        Container c = getContentPane();
        c.setLayout(null); //컨텐트 팬의 배치관리자 제거

        JLabel la = new JLabel("Hello, Press Buttons!"); // JLabel 컴포넌트 생성, 위치 크기 직접지정
        la.setLocation(130, 50); // la를 (130,50) 위치로 지정
        la.setSize(200, 20); //la를 200x20 크기로 지정
        c.add(la); //la를 컨텐트팬에 부착

        //9개의 버튼 컴포넌트를 생성하고 모두 동일한 크기로 설정한다.
        //위치는 서로 다르게 설정
        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i)); // 버튼 생성
            b.setLocation(i * 15, i * 15); //버튼의 위치 설정
            b.setSize(50, 20); //9개의 버튼 크기는 동일하게 50x20
            c.add(b); // 버튼을 컨텐트팬에 부착
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}