package typingGame;

import java.awt.Color;
import java.awt.Graphics2D;

import java.util.List;

import javax.swing.Action;

import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guis.components.TextLabel;



public class GameScreen extends ClickableScreen implements Runnable {
	private ThemedTextLabel label;
	private ThemedTextLabel timelabel;
	private CustomButton start;
	 private double timeLeft;
	
	public static final Color BUTTON_COLOR = new Color(255, 255, 255);

	public GameScreen(int width, int height) {
		super(width, height); 

	}
	
	

	@Override
	public void initAllObjects(List<Visible> view) {
		label = new ThemedTextLabel(200, 200, 120, 50, "30.0", Color.black);
		view.add(label);
		timelabel = new ThemedTextLabel(50, 250, 200, 50, "Time Remaining", Color.black);
		view.add(timelabel);
	//	start = new CustomButton(600, 55, 200, 100, "START",Color.GREEN,Color.yellow);
		
	}



	@Override
	public void run() {
		
		
	}
	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft-= .1;
		//.1 is not a clean number in binary 
		//so to fix the output, we use this little formula to round
		//to the nearest tenth
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
	}
	//USE THIS METHOD IN "SIMON" TOO!
	private void changeText(String string){
		label.setText(string);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	

}
