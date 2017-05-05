package typingGame;

import java.util.List;

import guiTeacher.interfaces.Visible;


public class GameScreen extends guiTeacher.userInterfaces.ClickableScreen implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameScreen(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}
