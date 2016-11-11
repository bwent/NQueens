


public class NQueensMain {


	public static void main(String[] args) {

		int size = 0;
		int maxSteps = 0;
		int approach = 0;
		int tweak = 0;

		if (args.length < 3) {
			System.err.println("Specify a size, maximum number of steps, and approach.");
			System.exit(1);
		}

		try {
			size = Integer.parseInt(args[0]);
			maxSteps = Integer.parseInt(args[1]);
			approach = Integer.parseInt(args[2]);

			if (args.length == 4) {
				tweak = Integer.parseInt(args[3]);
			}


		} catch (NumberFormatException e) {
			System.err.println("Numbers must be integers.");
			System.exit(1);
		}


		new NQueensClass(size, maxSteps, approach, tweak);

	}

}
