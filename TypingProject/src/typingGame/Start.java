package typingGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import guiTeacher.GUIApplication;
import guiTeacher.components.Button;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.Screen;

public class Start extends GUIApplication {
	private static Button start;
	public static Start app;
	public static Screen GameScreen;
	public static Screen ws;
	
	public Start(int width, int height) {
		super(width, height);
	}
	public static void main(String[] args) {
		app = new Start(800, 800);

		Thread go = new Thread(app);
		go.start();

	}

	@Override
	public void initAllObjects(ArrayList<Visible> view) {
		start = new Button(600, 55, 200, 100, "", Color.GREEN, new Action() {
			public void act() {
				
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addPropertyChangeListener(PropertyChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getValue(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void putValue(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removePropertyChangeListener(PropertyChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setEnabled(boolean arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	
		
	}
	@Override
	public void initScreen() {
		ws = new GameScreen(getWidth(),getHeight());
		setScreen(ws);
		
	}

}
