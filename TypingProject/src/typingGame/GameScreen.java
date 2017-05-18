package typingGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guiTeacher.userInterfaces.FullFunctionScreen;
import typingGame.ThemedTextLabel;
import typingGame.Car;
import typingGame.CarInterface;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;




public class GameScreen extends FullFunctionScreen implements Runnable {
	
	private ArrayList<CarInterface> car;
	private ThemedTextLabel label;
	private ThemedTextLabel timelabel;
	private TextInput keyin;
	private CustomButton start;
	 private double timeLeft;
	
	public static final Color BUTTON_COLOR = new Color(255, 255, 255);

	public GameScreen(int width, int height) {
		super(width, height); 
		timeLeft = 60.0;
		Thread play = new Thread(this);
		play.start();
		 JFrame frame = new JFrame();
		  ImageIcon icon = new ImageIcon("resource/car.jpg");
		  JLabel label = new JLabel(icon);
		  frame.add(label);
		  frame.setDefaultCloseOperation
		         (JFrame.EXIT_ON_CLOSE);
		  frame.pack();
		  frame.setVisible(true);
	}
	
	

	@Override
	public void initAllObjects(List<Visible> view) {
		car = new ArrayList<CarInterface>();
		label = new ThemedTextLabel(200, 150, 120, 50, "", Color.black);
		view.add(label);
		timelabel = new ThemedTextLabel(50, 250, 200, 50, "", Color.black);
		view.add(timelabel);
	//	start = new CustomButton(600, 55, 200, 100, "START",Color.GREEN,Color.yellow);
		keyin = new TextInput();
		view.add(keyin);
		
		
	}
	public CarInterface getACar(){
		return new Car(150,100);
	}
	private void appearCar(){
		final CarInterface car = getACar();
		car.setAppearanceTime(100);
		
	}
	


	@Override
	
		public void run() {
			
			//since this is a timed game, we will use a while loop
			//this is not necessary for games that 
			//aren't timed (like Simon)
		changeText("Ready...");
		changeText("Set....");
		changeText("Go.....");
		label.setText("");	
		while(timeLeft > 0){
				updateTimer();
				
			}
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
		timelabel.setText(""+(int)(timeLeft*10)/10.0);
		
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
