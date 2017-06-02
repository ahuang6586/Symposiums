package typingGame;

import java.awt.Color;
import java.awt.Graphics2D;

import  guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.MovingComponent;


public class Car extends MovingComponent {
	
	private String imgLoc;
	private Thread cThread;
	private Graphic truck;
	
	public Car(int x, int y, int w, int h,int vx) {
		super(x, y, w, h);
		this.imgLoc = imgLoc;
		truck = new Graphic(0,0,w,h,"resource/car.png");
		setX(x);
		setY(y);
		setVx(vx);
		
	}
	public void checkBehaviors(){
		if(posy+vy > 600){
			posy = 600;
			vy=-vy;
		}
		else if(posy+vy < 20){
			posy = 20;
			vy=-vy;
		}
		
		if(posx+vx > 600){
			posx = 600;
			vx=-vx;
		}
		else if(posx+vx < 20){
			posx = 20;
			vx=-vx;
		}
		
	}
	public void drawImage(Graphics2D g) {
		g.setColor(Color.black);
		g.drawImage(truck.getImage(),0, 0 ,null);
	}
}
