import java.util.Scanner;
import java.math.*;

public class Homework10_18{
	public static void main(String[] args){
		/*(Large prime numbers)
		Write a program that finds five prime numbers
		larger than Long.MAX_VALUE.*/
		Scanner input = new Scanner(System.in);
		StopWatch timer = new StopWatch();

		boolean isPrime = true;
		System.out.print("Enter the number that you would like to start at: ");
		BigInteger ourNumber = new BigInteger(input.next());
		System.out.print("Enter how many prime numbers you want to find: ");
		int totalNumbers = input.nextInt();
		int foundNumbers = 0;

		timer.start();
		while(foundNumbers < totalNumbers){
			isPrime = true;
			for(BigInteger primeChecker = BigInteger.valueOf(2); primeChecker.compareTo(ourNumber) < 0;
			primeChecker = primeChecker.add(BigInteger.ONE)){
				if(BigInteger.ZERO.equals(ourNumber.mod(primeChecker))){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(ourNumber + " is prime");
				foundNumbers++;
				System.out.println("Found " + foundNumbers);
			}
//			ourNumber = ourNumber.add(BigInteger.ONE);
			ourNumber = ourNumber.nextProbablePrime();
		}
		timer.stop();
	}
}
