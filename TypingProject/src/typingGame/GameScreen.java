package typingGame;

import java.awt.Color;
import java.awt.Graphics2D;

import java.util.List;

import javax.swing.Action;

import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;



public class GameScreen extends ClickableScreen implements Runnable {
	private ThemedTextLabel label;
	private ThemedTextLabel timelabel;
	private CustomButton start;
	public static final Color BUTTON_COLOR = new Color(255, 255, 255);

	public GameScreen(int width, int height) {
		super(width, height); 

	}
	
	

	@Override
	public void initAllObjects(List<Visible> view) {
		label = new ThemedTextLabel(50, 200, 120, 50, "Start", Color.black);
		view.add(label);
		timelabel = new ThemedTextLabel(50, 250, 120, 50, "Time Remaining", Color.black);
		view.add(timelabel);
	}



	@Override
	public void run() {
		
		
	}

}
