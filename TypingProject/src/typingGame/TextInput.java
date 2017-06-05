package typingGame;

import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import interfaces.ProgressInterface;

public class TextInput extends TextField {
	
	private ThemedTextLabel display;
	private String textToType;
	private ProgressInterface score;
	
	
	
private String[] words = {"Love", "Hate", "Truth", "Happy", "Pressure",  "Vampire"
			
	        , "Surf", "Believe", "Slime", "Dream", "Religion", "Rhythm", "Disco", "Honey",
	
	        "Star", "Armies", "Zombie", "Heart", "Break", "Docks", "Multiply", "Mace", "Moustache"
	
	        , "Wizards", "Sports", "Blind", "Riddle", "Business", "School", "Blood", "Promenade",
	
	        "Vault", "Spray", "Eternal", "Dress", "Abstain", "Controls", "Circuit", "Forever",
	
	        "Dangerous", "Skunk", "House", "Wives", "Flashlight", "Console", "Awesome", "Scared",
	
	        "Hormones", "Promise", "Angel", "Baggage", "Duck", "Destroy", "Tissue", "Ketchup",
	
	        "Picture", "Basket", "Basketball", "Fan", "Dough", "Thief", "Female", "Family", "Normal",
	
	        "Wireless", "Empty", "Cycles", "Banana", "Eggplant", "Samba", "Jumble", "Flush", "Beach",
	
	        "Driver", "Queen", "Fade", "Kitten", "Spring", "Interest", "Debts", "Horse",
	
	        "Tomorrow", "Discount", "Faithful", "Midnight", "Epic", "Calendar", "Roses", "Funeral",
	
	        "Badminton", "Spirit", "Water", "Pizza", "Science", "Cabinet", "Apple", "Television",
	
	        "Profile", "Wine", "Sedan", "Luxury", "Firewall", "Computer", "Tablet", "Giraffe", "Ring",
	
	        "Shut", "Vision", "World", "War", "High", "School", "Fantasy", "Warfare", "Incognito",
	
	        "Loading", "Penguins", "Fright", "Night", "Diary", "Mega", "Submit", "Hold", "Statue",
	
	        "Boat", "Mobile", "Invisible", "Visible", "Ground", "Space", "Dragon", "Spade", "Clover",
	
	        "Senior", "Junior", "Sophomore", "Freshman", "Twilight", "Dawn", "Eclipse", "Moon",

	        "Hair", "Spray", "Camp", "Jazz", "Rock", "Eggs", "Hustle"};
	public TextInput() {
		super(50,500,300,50,"Type Here");
		

	}
	
	public void keyTyped(KeyEvent e){
		super.keyTyped(e);
		char c = e.getKeyChar();
		String t = getText();

		
		if(c == KeyEvent.VK_SPACE ){
//			new Game(800,600);
//			double timeLeft = 60.0;
//			Thread play = new Thread(this);
//			play.start();
//			 JFrame frame = new JFrame();
//			  ImageIcon icon = new ImageIcon("resource/car.jpg");
//			  JLabel label = new JLabel(icon);
//			  frame.add(label);
//			  frame.setDefaultCloseOperation
//			         (JFrame.EXIT_ON_CLOSE);
//			  frame.pack();
//			  frame.setVisible(true);
			
		}
		
		
		
	}
	public void initAllObjects(List<Visible> view){
		score = getAScore();
		view.add((Visible) score);
	}
	private ProgressInterface getAScore() {
		return new Score();
	}
	public void setDisplay(ThemedTextLabel label) {
		display = label;
	}
	public void checkEntry() {
			if(getText().equals(textToType)){
			
				
			setCursor(0);
			setText("");
			if(score!=null){
				score.increaseScore(textToType.length());
			}
			textToType = words[(int) ((Math.random()*words.length)+1)];
			display.setText(textToType);
			
		}
		
	}
	
	public void setStart() {
		
		textToType = words[(int) ((Math.random()*words.length)+1)];
		display.setText(textToType);
	}

	public void setPointTracker(ProgressInterface score2) {
		// TODO Auto-generated method stub
		this.score = score2;
	}
	public void restart(){
		
	}
	
}
