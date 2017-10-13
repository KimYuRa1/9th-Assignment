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
			public void mousePressed(MouseEvent e) {//마우스가 컴포넌트 위에서 눌려지면 호출
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent e) {}//마우스가 컴포넌트 위에서 떼어지면 호출
			public void mouseEntered(MouseEvent e) {}//마우스 커서가 컴포넌트로 들어가면 호출
			public void mouseExited(MouseEvent e) {}//마우스 커서가 컴포넌트에서 나가면 호출
			public void mouseClicked(MouseEvent e) {}//사용자가 컴포넌트를 클릭한 경우에 호출
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
