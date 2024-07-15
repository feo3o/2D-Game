import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel implements Runnable{
	//Screen Settings
	public final int originalTileSize = 16;
	public final int scale = 3;
	public final int tileSize = originalTileSize * scale;
	public final int maxScreenCol = 16;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenCol;
	public final int screenHeigth = tileSize * maxScreenRow;

	Thread gameThread;	

	public Panel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeigth));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}


	public void run() {
		while(gameThread != null) {
		
		// Update 
		update();

		// Draw
		repaint();

		}	
	}

	public void update() {
	
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		g2.setColor(Color.white);
		g2.fillRect(150, 150, tileSize, tileSize);
		g2.dispose();
	}
}
