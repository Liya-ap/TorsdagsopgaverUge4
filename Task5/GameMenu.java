import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}

	public void displayMenu() {
		for (String s: actions) {
			System.out.println(s);
		}
	}

	public String getAction() {
		//5.a
		System.out.println("Type a number to choose an action");
		displayMenu();

		//5.b
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		//5.c
		return choice;
	}
}