package typingGame;

import java.awt.event.KeyEvent;

import guiTeacher.components.TextField;

public class TextInput extends TextField {

	public TextInput() {
		super(50,500,300,50,"Sample");
		

	}
	public void keyTyped(KeyEvent e){
		super.keyTyped(e);
		char c = e.getKeyChar();
		String t = getText();
//		if(c == KeyEvent.VK_W){
//			System.out.print("yes");
//		}
//		else{
//			System.out.print("no");
//		}
		if(c == KeyEvent.VK_W ){
			System.out.println("Right");
		}
		
		
		
	}
	
}
