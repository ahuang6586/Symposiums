package typingGame;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;
import interfaces.ProgressInterface;

public class Score extends Component implements ProgressInterface {
	
	private int score;
	public Score()  {
		super(20,20,100,100);
	}

	

	@Override
	public void increaseScore(int i) {
		score+= i;
		update();
		
	}

	@Override
	public void update(Graphics2D g) {
		
		g.setColor(new Color(200,220,255));
		g.fillRect(0, 0, 99, 99);
		g.setColor(Color.black);
		g.drawRect(0, 0, 99, 99);
		g.drawString("Score = "+score, 30, 55);
		
	}

}
