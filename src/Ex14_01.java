import javax.swing.*;
import java.awt.*;


public class Ex14_01 extends JFrame {
	
	public Ex14_01() {  // 생성자
		setTitle("프레임 및 아이콘"); // 프레임 제목
		setSize(600,300); // 프레임 크기 설정 (가로, 세로)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel);
		
		setIconImage(new ImageIcon("img/cokeimage.png").getImage());
		setVisible(true); // 이 문장 없으면 아이콘 못 봄.
	}

	public static void main(String[] args) {
		new Ex14_01();
	}

}
