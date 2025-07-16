// This is a class that plays the GUI version of the Elevens game.

public class ElevensGUIRunner {

	public static void main(String[] args) {
		ElevensBoard board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}

}
