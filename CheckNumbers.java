import java.util.Scanner;

public class CheckNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		StopWatch timer = new StopWatch();

		int choice = 0;

		System.out.print("If you want to divide a whole number, press 1. If you don't want to do anything press 0: ");
		choice = input.nextInt();
		if(choice == 1){
			System.out.println("Whole number.");
			WholeDivision whole = new WholeDivision(input);
			timer.start();
			whole.divide();
			timer.stop();
		}
		else if(choice == 0){
			System.out.println("Have a nice day");
		}
		else{
			System.out.println("Your choice can't be processed right now, please hang-up, and try again.");
		}
		input.close();
	}
}
