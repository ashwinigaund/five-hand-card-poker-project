import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Player player = new Player(5);
		Boolean playAgain = true;
		String confirm = "";

		while (playAgain) {
			player.drawCards();

			System.out.println("Shuffling ... Shuffling ... Shuffling ...");
			System.out.print("Your hand: ");
			player.printHand();

			System.out.print("You have: ");
			player.printPlayerRank();
			
			System.out.println();
			System.out.print("Do you wish to draw again? Y/N > ");
			confirm = scanner.nextLine();

			if (!confirm.toLowerCase().equals("y") && !confirm.toLowerCase().equals("yes")) {
				playAgain = false;
			}
			System.out.println();
		}
		scanner.close();
	}
}
