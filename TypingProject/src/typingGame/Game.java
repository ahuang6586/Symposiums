package typingGame;

import guiTeacher.GUIApplication;


public class Game extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Game(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		GameScreen gs = new GameScreen(getWidth(),getHeight());
		setScreen(gs);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game sg = new Game(800,600);
		Thread game = new Thread(sg);
		game.start();

	}

}
