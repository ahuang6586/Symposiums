package typingGame;

import java.awt.event.KeyEvent;

import guiTeacher.components.TextField;

public class TextInput extends TextField {
	
	private ThemedTextLabel display;
	private String textToType;
	private int index;
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
//		if(c == KeyEvent.VK_W){
//			System.out.print("yes");
//		}
//		else{
//			System.out.print("no");
//		}
		for(int i = 0; i < words[i].length();i++){
			
		}
		
		if(c == KeyEvent.VK_W ){
			System.out.println("Right");
		}
		
		
		
	}
	public void setDisplay(ThemedTextLabel label) {
		display = label;
	}
	public void checkEntry() {
		if(getText().equals(textToType)){
			index++;
			
			setCursor(0);
			setText("");
			textToType = words[index];
			display.setText(textToType);
		}
	}
	public void setStart() {
		textToType = words[index];
		display.setText(textToType);
	}
	
}
