import javax.swing.*;
import java.awt.event.*;

public class MyListener implements ActionListener {//�̺�Ʈ ������ Ŭ����

	public void actionPerformed(ActionEvent e){
		JButton button = (JButton)e.getSource();//Ư�� JButton�� click�� �� JButton�� button�� ����
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
		//label.setText("��ħ�� ��ư�� ���������ϴ�.");
	}
}
