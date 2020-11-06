import java.util.Scanner;

public class CheckNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		StopWatch timer = new StopWatch();

		int choice = 0;

		System.out.print("If you want to divide a whole number, press 1.\nIf you want to find prime numbers, press 2"+
				 "\nIf you don't want to do anything press 0: ");
		choice = input.nextInt();
		if(choice == 1){
			NumberOne(input, timer);
		}
		else if(choice == 2){
			NumberTwo(input, timer);
		}
		else if(choice == 0){
			System.out.println("Have a nice day");
		}
		else{
			System.out.println("Your choice can't be processed right now, please hang-up, and try again.");
		}
		input.close();
	}

	public static void NumberOne(Scanner input, StopWatch timer){
		System.out.println("Whole number.");
		WholeDivision whole = new WholeDivision(input);
		timer.start();
		whole.divide();
		timer.stop();
	}

	public static void NumberTwo(Scanner input, StopWatch timer){
		System.out.println("Prime number");
		PrimeGetter prime = new PrimeGetter(input);
		timer.start();
		prime.findPrimes();
		timer.stop();
	}
}
