package typingGame;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;


public class Game extends GUIApplication {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Game app;
	public static Screen ws;
	
	public Game(int width, int height) {
		super(width, height);
		
	}
	@Override
	public void initScreen() {
		
		ws = new GameScreen(getWidth(), getHeight());
		setScreen(ws);
	}
	public static void main(String[] args) {
		
		app = new Game(800,600);
		Thread game = new Thread(app);
		game.start();

	}
	

	

	

}
