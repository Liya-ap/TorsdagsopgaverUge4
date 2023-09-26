import java.util.ArrayList;

//4.a
public class GameMenu {
	//4.b
	private ArrayList<String> actions;

	//4.c & 4.d
	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}

	//4.h
	public void displayMenu() {
		for (String s: actions) {
			System.out.println(s);
		}
	}
}