
public class FizzBuzz {
	/* Written by David Paul Wilson, July 18 2019
	 * 
	 * The purpose of this project is simply to demonstrate my thought process in coding and to practice solving the classic "FizzBuzz"
	 * problem as I understand it, stated below:
	 * 
	 * Print the numbers 1-100 each on new lines, with the following substitutions for the number:
	 *  -"Fizz" if the number is divisible by 3,
	 *  -"Buzz" if the number is divisible by 5, and
	 *  -"FizzBuzz" if the number is divisible both by 3 and by 5.
	 *  
	 *  This code was written in Eclipse Photon.
	 */

	public static void main(String[] args) {
		/* My first attempt to solve this problem in an efficient manner is through the use of a for loop and a few simple if-else statements.
		 * It checks divisibility by 3 and 5 and records the result with a pair of booleans. Then it prints the outcome based on said booleans.
		 * My object in this pursuit is to reduce the number of divisibility calculation pairs to once per iteration.
		 * 
		 * It takes the following pattern:
		 * 
		 * for (i to 100)
		 *     if (divisible by 3) then (Fizz = True)
		 *     if (divisible by 5) then (Buzz = True)
		 *     
		 *     if (Fizz & Buzz) then print "FizzBuzz"
		 *     else if (Fizz) then print "Fizz"
		 *     else if (Buzz) then print "Buzz"
		 *     else print the number
		 */
		
		// I begin by creating two booleans to record divisibility by, respectively, 3 and 5. I initialize them to "false."
		boolean fizz = false;
		boolean buzz = false;
		
		// Iterate through the integers 1 to 100.
		for (int i = 1; i <= 100; i++) {
			
			// Check for divisibility and adjust booleans accordingly.
			if (i % 3 == 0) fizz = true;
			if (i % 5 == 0) buzz = true;
			
			// Select printing based on booleans. Reset booleans as necessary.
			if (fizz && buzz) {
				System.out.println("FizzBuzz");
				fizz = false;
				buzz = false;
			}
			else if (fizz) {
				System.out.println("Fizz");
				fizz = false;
			}
			else if (buzz) {
				System.out.println("Buzz");
				buzz = false;
			}
			else {
				System.out.println(i);
			} // End of if-else statements
		} // End of for loop
		
		// Print out a final message noting completion.
		System.out.println("\nFizzBuzz test complete. Have a nice day.");

	} // End of main method

}
