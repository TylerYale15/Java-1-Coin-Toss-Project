import java.util.*;

public class CoinTossGame {

	public static void main(String[] args) {
		System.out.println(
				"Welcome to the Tossing Game!\nYou flip a coin to get points.\nIf the coin lands on heads then you get how much the coin is worth.\nIf it lands on tails then you get nothing\nYour objective is to get a total score of $1.00.\nIf you exceed that score then you lose!\n");
		int Round = 0;
		// current round accumulator
		double Total = 0;
		// total score
		String Choice;
		// where the value of the client's input is stored
		String flip;
		// where the value of the if the user flipped is
		boolean runAgain = true;
		// does the program need to run again
		Scanner getInput = new Scanner(System.in);
		// object that gets the value of the client's input
		while (runAgain)
		// runs as long as the client wants
		{
			while (Total < 1.00)
			// run the loop while the total is less than 1
			{
				Round += 1;
				// increment the round each iteration of the loop
				System.out.println("Round " + Round + "\n---------");
				// print the round accumulator
				CoinFlip coinFlip = new CoinFlip();
				// create the coinFlip object
				for (int i = 0; i < 4; i++) {
				// loop 4 times for every denomination
					if (i == 0) {
					// for every loop get the client's input and determine the face of the coin
						System.out.println("Press F to flip: ");
						flip = getInput.nextLine();
						while (!flip.equalsIgnoreCase("F")) {
							System.out.println("You must enter F!: ");
							flip = getInput.nextLine();
						}
						if (flip.equalsIgnoreCase("F")) {
							double Quarter = coinFlip.getQuarterVal();
							// set value Quarter equal to .25 or 0
							if (Quarter == 0){
								System.out.println("(Tails) Quarter: $" + Quarter);
								// print the value of Penny
							}else{
								System.out.println("(Heads) Quarter: $" + Quarter);
							}
							Total += Quarter;
							// add Quarter to Total
						}
					} else if (i == 1) {
					// for every loop get the client's input and determine the face of the coin
						System.out.println("Press F to flip: ");
						flip = getInput.nextLine();
						while (!flip.equalsIgnoreCase("F")) {
							System.out.println("You must enter F!");
							flip = getInput.nextLine();
						}
						double Dime = coinFlip.getDimeVal();
						// set the value of Dime equal to .1 or 0
						if (Dime == 0){
							System.out.println("(Tails) Dime: $" + Dime);
							// print the value of Penny
						}else{
							System.out.println("(Heads) Dime: $" + Dime);
						}
						Total += Dime;
						// add Dime to Total

					} else if (i == 2) {
					// for every loop get the client's input and determine the face of the coin
						System.out.println("Press F to flip: ");
						flip = getInput.nextLine();
						while (!flip.equalsIgnoreCase("F")) {
							System.out.println("You must enter F!");
							flip = getInput.nextLine();
						}
						double Nickel = coinFlip.getNickelVal();
						// set the value of Nickel to .05 or 0
						if (Nickel == 0){
							System.out.println("(Tails) Nickel: $" + Nickel);
							// print the value of Penny
						}else{
							System.out.println("(Heads) Nickel: $" + Nickel);
						}
						Total += Nickel;
						// add Nickel to Total
					} else if (i == 3) {
					// for every loop get the client's input and determine the face of the coin
						System.out.println("Press F to flip: ");
						flip = getInput.nextLine();
						while (!flip.equalsIgnoreCase("F")) {
							System.out.println("You must enter F!");
							flip = getInput.nextLine();
						}
						double Penny = coinFlip.getPennyVal();
						// set the value of Penny to .01 or 0
						if (Penny == 0){
							System.out.println("(Tails) Penny: $" + Penny);
							// print the value of Penny
						}else{
							System.out.println("(Heads) Penny: $" + Penny);
						}
						Total += Penny;
						// add Penny to Total
					}
				}
				System.out.println("Total: $" + String.format("%.2f", Total) + "\n");
				// print the value of Total in two decimal spaces
			} // End of while

			if (Total == 1.00)
			// check if Total is equal to 1
			{
				System.out.println("Congratulations! Your total is $1.00!" + "\n");
				// print statement
			} else
			// if Total is not 1
			{
				System.out.println(
						"Sorry, your total of $" + String.format("%.2f", Total) + " is greater than $1.00" + "\n");
				// print statement
			}

			System.out.println("Y. PLAY AGAIN" + "\n" + "N. QUIT");
			// ask the client if they want to continue
			Choice = getInput.next();
			// get their input
			while (!Choice.equalsIgnoreCase("Y") && !Choice.equalsIgnoreCase("N")) {
				// if the client's input is not Y or N then ask for their input again
				System.out.println("Please enter Y or N!");
				Choice = getInput.nextLine();
			}
			// validate their input
			if (Choice.equalsIgnoreCase("Y"))
			// if client's input is Y then restart
			{
				runAgain = true;
				Total = 0;
				Round = 0;
			}

			else if (Choice.equalsIgnoreCase("N"))
			// if client's input is N then end program
			{
				runAgain = false;
				getInput.close();
				// close Scanner

			}

		} // End of while loop for program
		System.out.println("Goodbye!");

	}// End of main

}// End of class
