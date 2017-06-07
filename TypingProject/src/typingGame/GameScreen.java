package typingGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.MovingComponent;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guiTeacher.userInterfaces.FullFunctionScreen;
import guiTeacher.userInterfaces.Screen;
import interfaces.ProgressInterface;
import typingGame.ThemedTextLabel;
import typingGame.ThemedTitle;
import typingGame.Car;
import typingGame.CarInterface;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.io.IOException;





public class GameScreen extends FullFunctionScreen implements Runnable, ActionListener {
	
	
	private ArrayList<CarInterface> car;
	private ThemedTextLabel label;
	private ThemedTextLabel timelabel;
	private ThemedTextLabel startword;
	private ThemedTextLabel wordstotype;
	private ThemedTextLabel underline;
	private ThemedTitle title;
	private TextInput keyin;
	private Button start;
	private double timeLeft;
	public static Screen ws; 
	private MovingComponent image;
	Timer tm = new Timer(5, this);
	int x = 500;
	int velX = -5;
	private ThemedTextLabel word;
	private AnimatedComponent a;
	private MovingComponent m;
	private Button restart;
	private ProgressInterface score;
	
	
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
//	public void paintComponent(Graphics g){
//		super.paintComponent(g);
//		g.setColor(Color.RED);
//		g.fillRect(x, 30, 50, 30);
//		tm.start();
//	}

	
	

	public void initAllObjects(List<Visible> view) {
//		int w = 165;
//		int h = 293;
//		int numberInRow =12;
//		int rows = 5;
	
		score = getAScore();
		view.add((Visible) score);
		title =  new ThemedTitle(100, 0, 400, 200, "Typing Game", Color.black);
		view.add(title);
		underline = new ThemedTextLabel(100, 150, 330, 50, "__________________________________", Color.black);
		view.add(underline);
		label = new ThemedTextLabel(200, 250, 120, 50, "", Color.black);
		view.add(label);
		timelabel = new ThemedTextLabel(50, 300, 200, 50, "", Color.black);
		view.add(timelabel);
		wordstotype = new ThemedTextLabel(130, 250, 120, 50, "Type:", Color.black);
		view.add(wordstotype);
		start = new Button(600, 55, 200, 100, "", GameScreen.BUTTON_COLOR, new Action() {
			
			@Override
			public void act() {
				
				//play.stop();
				//close thread and then remake
			}

		});
		view.add(start);
		
		startword = new ThemedTextLabel(650, 25, 200, 100, "RESTART", Color.black);
		view.add(startword);
		keyin = new TextInput();
		view.add(keyin);
		image = new Car(0, 400, 100, 100,1);
		view.add(image);
		
		
		
	}
	
	private void restart() {
		
		
		
		
	}

	


	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
	private void setScreen(Screen ws2) {
	
	}




	private ProgressInterface getAScore() {
		return new Score();
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
		keyin.setDisplay(label);
		keyin.setPointTracker(score);
		keyin.setStart();
		Thread x= new Thread(image);
		x.start();
		while(timeLeft > 0){
				
				updateTimer();
				keyin.checkEntry();
				

//				if((boolean) keyin.checkEntry()== true){
//					score.increaseScore(1);
//
//				}
				
			}
		image.setRunning(false);
		
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




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	


//	@Override
//	public void actionPerformed(ActionEvent e) {
//		x = x + velX;
//		repaint();
//	}
	

}
