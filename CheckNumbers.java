import java.util.Scanner;

public class CheckNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		StopWatch timer = new StopWatch();

		int choice = 0;

		System.out.print("If you want to divide a decimal, press 1. If you want to divide a whole number, press 2. If you don't want to do either press 0: ");
		choice = input.nextInt();
		if(choice == 1){
			DecimalDivision decimal = new DecimalDivision(input);
		}
		else if(choice == 2){
			System.out.println("A whole number, good for you.");
			WholeDivision whole = new WholeDivision(input);
			timer.start();
			whole.divide();
			timer.stop();
			timer.getElapsedTime();
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
