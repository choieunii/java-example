package layout;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame"); // 프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
        Container contentPane = getContentPane(); //컨텐트팬을 알아낸다.
        contentPane.setBackground(Color.ORANGE); //컨텐트팬의 색을 오렌지색으로
        contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 설정
        contentPane.add(new JButton("OK")); //OK버튼 달기
        contentPane.add(new JButton("Cancel")); //Cancel 버튼 달기
        contentPane.add(new JButton("Ignore")); //Ignore 버튼 달기
        setSize(300, 150); //프레임크기 300x150 설정
        setVisible(true); // 화면에 프레임 츨력 없을시 나타나지 않는다.
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
