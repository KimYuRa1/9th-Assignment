import javax.swing.*;
import java.awt.event.*;

public class MyListener implements ActionListener {//이벤트 리스너 클래스

	public void actionPerformed(ActionEvent e){
		JButton button = (JButton)e.getSource();//특정 JButton을 click시 그 JButton을 button에 복사
		button.setText("마침내 버튼이 눌러졌습니다.");
		//label.setText("마침내 버튼이 눌러졌습니다.");
	}
}
