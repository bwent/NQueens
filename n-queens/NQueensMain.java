
import java.lang.Integer;

public class NQueensMain {


	public static void main(String[] args) {

		int size = 0;
		int maxSteps = 0;

		if (args.length != 0) {
	    try {

	        size = Integer.parseInt(args[0]);
					maxSteps = Integer.parseInt(args[1]);

	    } catch (NumberFormatException e) {
	        System.err.println("Argument" + args[0] + " must be an integer.");
	        System.exit(1);
	    }
	}

		new NQueensClass(size, maxSteps);

	}

}
