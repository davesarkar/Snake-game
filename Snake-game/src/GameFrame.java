import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class GameFrame extends JFrame {

	GameFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Hungry Snake");
		
		ImageIcon im = new ImageIcon("snake.png");
		
		this.setIconImage(im.getImage());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		}
}
