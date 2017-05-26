package typingGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.MovingComponent;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guiTeacher.userInterfaces.FullFunctionScreen;
import typingGame.ThemedTextLabel;
import typingGame.Car;
import typingGame.CarInterface;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;




public class GameScreen extends FullFunctionScreen implements Runnable, ActionListener {
	
	
	private ArrayList<CarInterface> car;
	private ThemedTextLabel label;
	private ThemedTextLabel timelabel;
	private ThemedTextLabel startword;
	private TextInput keyin;
	private Button start;
	private double timeLeft;
	 
	private Graphic image;
	Timer tm = new Timer(5, this);
	int x = 500;
	int velX = -5;
	private ThemedTextLabel word;
	private AnimatedComponent a;
	private MovingComponent m;
	private Button restart;
	
	
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
	
		
		label = new ThemedTextLabel(200, 150, 120, 50, "", Color.black);
		view.add(label);
		timelabel = new ThemedTextLabel(50, 250, 200, 50, "", Color.black);
		view.add(timelabel);
		start = new Button(600, 55, 200, 100, "", GameScreen.BUTTON_COLOR, new Action() {
			public void act() {
				
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addPropertyChangeListener(PropertyChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getValue(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void putValue(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removePropertyChangeListener(PropertyChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setEnabled(boolean arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		view.add(start);
		startword = new ThemedTextLabel(650, 25, 200, 100, "START", Color.black);
		view.add(startword);
		keyin = new TextInput();
		view.add(keyin);
		image = new Graphic(500, 200, 100, 100, "resource/car.png");
		view.add(image);
//		for(int i = 0; i < words.length; i++){			
//			word = new ThemedTextLabel(200, 200, 200, 200, words[i],Color.black);
//		}
//		view.add(word);
		
		
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
