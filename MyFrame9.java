import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel{
	BufferedImage img=null;
	int img_x=0, img_y=0;
	public MyPanel2(){
		try {
			img = ImageIO.read(new File("car.gif"));
		}catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {//���콺�� ������Ʈ ������ �������� ȣ��
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent e) {}//���콺�� ������Ʈ ������ �������� ȣ��
			public void mouseEntered(MouseEvent e) {}//���콺 Ŀ���� ������Ʈ�� ���� ȣ��
			public void mouseExited(MouseEvent e) {}//���콺 Ŀ���� ������Ʈ���� ������ ȣ��
			public void mouseClicked(MouseEvent e) {}//����ڰ� ������Ʈ�� Ŭ���� ��쿡 ȣ��
		});
	}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(img,img_x,img_y,null);
		}
		
	}

	
public class MyFrame9 extends JFrame{
		public MyFrame9(){
			add(new MyPanel2());
			setSize(300,500);
			setVisible(true);
		}
		public static void main(String[] arg){
			new MyFrame9();
		}
}
