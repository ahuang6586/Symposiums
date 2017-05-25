package typingGame;

import  guiTeacher.components.ClickableGraphic;
import guiTeacher.components.MovingComponent;


public class Car extends MovingComponent {
	
	private String imgLoc;
	private Thread cThread;
	
	public Car(int x, int y, int w, int h, int vx, String imgLoc) {
		super(x, y, w, h);
		this.imgLoc = imgLoc;
		setX(x);
		setY(y);
		setVx(vx);
	}
	public String getImgLoc() {
		return imgLoc;
	}

	public void setImgLoc(String imgLoc) {
		this.imgLoc = imgLoc;
	}
	public void play() {
		if (!isRunning()) {
			cThread = new Thread(this);
			cThread.start();
		}
	}
	@Override
	public Thread getThread() {
		return cThread;
	}
}
