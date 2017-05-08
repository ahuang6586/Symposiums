package typingGame;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;


public class Game extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static GameScreen app;
	public static Screen gs;
	public Game(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		app = new GameScreen(800,600);
		Thread game = new Thread(app);
		game.start();

	}
	

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		gs = new GameScreen(getWidth(),getHeight());
		setScreen(gs);	
	}

	

}
