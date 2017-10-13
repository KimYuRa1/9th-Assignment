import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		
		JPanel panel=new JPanel();
		button=new JButton("버튼을 누르시오");
		label=new JLabel("아직 버튼이 눌리지 않았습니다.");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame t=new MyFrame();
	}

}
