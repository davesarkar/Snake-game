import javax.swing.JPanel;
import java.awt.*;
public class GamePanel extends JPanel {
	
	static final int SCREEN_WIDTH = 500;
	static final int SCREEN_HEIGHT = 600;
	
	
	
	GamePanel() {
		
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
	}
}
