import java.util.Scanner;

// create the main method
public class Calculator {
    public static void main( String[] args ) {
        // while loop that waits for user input
            // print out the options for use
	
	int intAns = 0;
	double douAns = 0;
	boolean flag = true;

	while ( flag ) {
		System.out.printf("List of operations: add subtract multiply divide alphabetize\n");
		Scanner progInput = new Scanner(System.in);
		System.out.printf("Enter an operation:\n");

		String p1 = progInput.nextLine();
		String chosenOp = p1.toLowerCase();

		switch (chosenOp) {
			case "add":
				System.out.printf("Enter two integers:\n");
				if ( input.hasNextInt() ) {
					int add1 = progInput.nextInt();

					if ( input.hasNextInt() ) {
						int add2 = progInput.nextInt();
						intAns = add1 + add2;

						System.out.printf("Answer: %d%n", intAns);
					} else {
						flag = false;
						break;
					}
				} else {
					flag = false;
					break;
				}

				break;
			
			case "subtract":
				System.out.printf("Enter two integers:\n");
				if ( input.hasNextInt() ) {
					int sub1 = progInput.nextInt();

					if ( input.hasNextInt() ) {
						int sub2 = progInput.nextInt();
						intAns = sub1 - sub2;

						System.out.printf("Answer: %d%n", intAns);
					} else {
						flag = false;
						break;
					}
				} else {
					flag = false;
					break;
				}

				break;

			case "multiply":
				System.out.printf("Enter two doubles:\n");
				if ( input.hasNextDouble() ) {
					int mul1 = progInput.nextDouble();

					if ( input.hasNextDouble() ) {
						int mul2 = progInput.nextDouble();
		        			douAns = mul1 * mul2;

						System.out.printf("Answer: %.2f%n", douAns);
					} else {
						flag = false;
						break;
					}
				} else {
					flag = false;
					break;
				}

				break;

			case "divide":

				System.out.printf("Enter two doubles:\n");
				if ( input.hasNextDouble() ) {
					int div1 = progInput.nextDouble();

					if ( input.hasNextDouble() ) {
						int div2 = progInput.nextDouble();
						
						if ( div2 != 0 ) {
							douAns = mul1 / mul2;
							System.out.printf("Answer: %.2f%n", douAns);
						} else {
							flag = false;
							break;
						}

					} else {
						flag = false;
						break;
					}
				} else {
					flag = false;
					break;
				}

				break;

			case "alphabetize":
			
				System.out.printf("Enter two words:\n");

				String[] str1 = progInput.nextLine().split(" ");

				String low1 = str1[0].toLowerCase();
				String low2 = str1[1].toLowerCase();
			
				if ( low1.compareTo(low2) < 0 ) {
					System.out.printf("%s comes before %s alphabetically.\n", str1[0], str1[1]);
				} else if ( low1.compareTo(low2) > 0 ) {
					System.out.printf("%s comes before %s alphabetically.\n", str1[1], str1[0]);
				} else if ( low1.compareTo(low2) == 0 ) {
					System.out.printf("These words are the same.\n");
				}	

				break;

			default:

				flag =  false;
				break;

			} // this closes the switch statement
       
	} // this closes the while loop
	
	System.out.printf("Invalid input entered. Terminating...\n");

    }
}

