package typingGame;

import java.util.List;

import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guiTeacher.userInterfaces.FullFunctionScreen;


public class GameScreen extends ClickableScreen implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameScreen(int width, int height) {
		super(width, height);
		Thread play = new Thread(this);
		play.start();

	}

	

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
