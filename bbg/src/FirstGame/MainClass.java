package FirstGame;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		JFrame f = new JFrame();
		f.setTitle("Brick Breaker Game");
		f.setSize(700,600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		GamePlay gp= new GamePlay();
		f.add(gp);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
