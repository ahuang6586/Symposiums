package typingGame;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;


public class Game extends GUIApplication {

	/**
	 * 
	 */
	
	
	public Game(int width, int height) {
		super(width, height);
		
	}
	@Override
	public void initScreen() {
		
		GameScreen gs = new GameScreen(800,600);
		setScreen(gs);
	}
	public static void main(String[] args) {
		
		Game g = new Game(800,600);
		Thread game = new Thread(g);
		game.start();

	}
	

	

	

}
