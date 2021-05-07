package layout.ans;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Let's study Java"); // 프레임 타이틀로 "hello" 문자열 출력
        setSize(200, 300); // 프레임 크기를 200x300으로 설정
        setVisible(true); // 프레임 화면 출력
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
