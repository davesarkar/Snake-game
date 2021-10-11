import javax.swing.JPanel;
import java.awt.*;
public class GamePanel extends JPanel {
	
	static final int SCREEN_WIDTH = 1000;
	static final int SCREEN_HEIGHT = 800;
	static final int UNITS = 25;
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNITS*UNITS;
	static final int DELAY = 100;
	
	GamePanel() {
		
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
	}
}
