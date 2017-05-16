package typingGame;

import  guiTeacher.components.ClickableGraphic;


public class Car extends ClickableGraphic implements CarInterface {
	private int appearanceTime;
	public Car(int x,int y) {
		super(x, y, .9,"resources/car.jpg");
	}
	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		// TODO Auto-generated method stub
		appearanceTime = screenTime;
	}
}
