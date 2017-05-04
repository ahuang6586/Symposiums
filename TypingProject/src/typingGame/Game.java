package typingGame;

import guiTeacher.GUIApplication;
import simon.SimonGame;
import simon.SimonGameScreen;

public class Game extends GUIApplication {

	public Game(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		GameScreen sms = new GameScreen(getWidth(),getHeight());
		setScreen(sms);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimonGame sg = new SimonGame(800,600);
		Thread game = new Thread(sg);
		game.start();

	}

}
