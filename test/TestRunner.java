import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
	public static void main(String[] args) {
		System.out.println("Running Tests ...");
		Result result = JUnitCore.runClasses(CardTest.class, DeckTest.class, PlayerTest.class, PokerOpsTest.class,
				RankingTest.class);
		System.out.println("Tests ran: " + result.getRunCount() + "\nFailed: " + result.getFailureCount());

		result.getFailures().stream().forEach(failure -> {
			System.out.println("Reason for failure: " + failure.toString());
		});
	}

}