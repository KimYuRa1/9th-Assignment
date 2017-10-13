//자동차게임예제(어댑터버전)

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyP extends JPanel{
	BufferedImage img=null;
	int img_x=0, img_y=0;
	public MyP(){
		try {
			img = ImageIO.read(new File("car.gif"));
		}catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseListener(new MouseAdapter() {////////////MyFrame9와 비교-어댑터 클래스의 경우 모든 메소드를 구현하지 않아도 됨!
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
		});
	}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(img,img_x,img_y,null);
		}
		
	}

	
public class MyPanel5 extends JFrame{
		public MyPanel5(){
			add(new MyP());
			setSize(300,500);
			setVisible(true);
		}
		public static void main(String[] arg){
			new MyPanel5();
		}
}