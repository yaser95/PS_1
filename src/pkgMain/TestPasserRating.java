import java.util.Scanner;

public class TestPasserRating {

	public static void main(String[] args) {
		double att; // number of passing attemps
		double comp; // number of completions
		double yds; // passing yards
		double td; // touchdown passes
		double inter; // interceptions
		double a, b, c, d;
		double passerRating;

		int stopped = 0;
		while (stopped != 0) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter number of passing attemps: ");
			att = in.nextDouble();
			System.out.print("Enter number of completions: ");
			comp = in.nextDouble();
			System.out.print("Enter passing yards: ");
			yds = in.nextDouble();
			System.out.print("Enter touchdown passes: ");
			td = in.nextDouble();
			System.out.print("Enter interceptions: ");
			inter = in.nextDouble();

			a = (comp / att - 0.3) * 5;
			b = (yds / att - 3) * 0.25;
			c = (td / att) * 20;
			d = 2.375 - (inter / att) * 25;

			passerRating = 100 * (a + b + c + d) / 6;

			System.out.println("Passer rating: " + String.valueOf(passerRating));

			System.out.print("Continue? 0: No; 1: Yes ");
			stopped = in.nextInt();
		}
		System.out.println("System exit...");
	}

}
