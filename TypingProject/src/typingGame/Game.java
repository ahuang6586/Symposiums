package typingGame;

import guiTeacher.GUIApplication;


public class Game extends GUIApplication {
	
	public static Game app;
	public static GameScreen gs;
	
	public Game(int width, int height) {
		super(width, height);	
	}
	
	@Override
	public void initScreen() {
		gs = new GameScreen(getWidth(), getHeight());
		setScreen(gs);
	}
	
	public static void main(String[] args) {
		app = new Game(800,600);
		Thread games = new Thread(app);
		games.start();

	}
	

	

	

}
