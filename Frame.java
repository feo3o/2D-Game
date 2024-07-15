import javax.swing.JFrame;

public class Frame extends JFrame {
	Frame() {
		this.setTitle("2D Game");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel panel = new Panel();
		this.add(panel);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		panel.startGameThread();
	}
}
