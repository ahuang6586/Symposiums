package typingGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;

public class ThemedBorder extends CustomButton {
	private Color color;
	public ThemedBorder( Color color, Action action) {
		super(0, 30, 900, 20, "", color, action, Color.black);
		this.color = color;
		update();
	}
	public void update(Graphics2D g){
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 25, 25);
	
		FontMetrics fm = g.getFontMetrics();
		if(getText() != null){
			g.setColor(Color.white);
			String t = getText();
			int cutoff = t.length();
			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
				cutoff --;
				t = t.substring(0,cutoff); 
			}
			g.drawString(t, (getWidth()-fm.stringWidth(t))/2, (getHeight()+fm.getHeight()-fm.getDescent())/2);
//			g.drawString(getText(), 4, (getHeight()-5));
		}	
	}
}
