import java.math.*;
public class Homework10_21{
	public static void main(String[] args){
		/*(Divisible by 5 or 6)
		Find the first ten numbers greater than Long.MAX_VALUE
		that are divisible by 5 or 6.*/

		StopWatch timer = new StopWatch();
		int foundNumbers = 0;
		BigInteger divisorOne = new BigInteger("5");
		BigInteger divisorTwo = new BigInteger("6");
		BigInteger numberToDivide = new BigInteger("9223372036854775807");

		timer.start();
		while(foundNumbers < 10){
			if(BigInteger.ZERO.equals(numberToDivide.mod(divisorOne))){
				System.out.println(numberToDivide + " is divisible by " + divisorOne);
				foundNumbers++;
				System.out.println("Found " + foundNumbers);
			}
			else if(BigInteger.ZERO.equals(numberToDivide.mod(divisorTwo))){
				System.out.println(numberToDivide + " is divisible by " + divisorTwo);
				foundNumbers++;
				System.out.println("Found " + foundNumbers);
			}
			numberToDivide = numberToDivide.add(BigInteger.ONE);
		}
		timer.stop();
	}
}
