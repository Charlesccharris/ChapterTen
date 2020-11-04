import java.math.*;

public class Homework10_16{
	public static void main(String[] args){
		/*(Divisible by 2 or 3)
		Find the first ten numbers with 50 decimal digits
		that are divisible by 2 or 3.*/
//		StopWatch timer = new StopWatch();

		BigDecimal number = new BigDecimal("10000000000000000000000000000000000000000000000000");
		BigDecimal divisorOne = new BigDecimal("2");
		BigDecimal divisorTwo = new BigDecimal("3");
		BigDecimal resultOne;
		BigDecimal resultTwo;

		int numberCount = 0;
		while(numberCount < 10){
			resultOne = number.remainder(divisorOne);
			resultTwo = number.remainder(divisorTwo);
			if(resultOne.equals(BigDecimal.ZERO) || resultTwo.equals(BigDecimal.ZERO)){
				System.out.println(number + " is divisible");
				numberCount++;
			}
			else{
				System.out.println(number + " isn't divisible");
				numberCount++;
			}
			number = number.add(BigDecimal.ONE);
		}

/*
		int foundNumbers = 0;
		double number = 0.1;
		int dividerOne = 2;
		int dividerTwo = 3;
		double resultOne;
		double resultTwo;

		timer.start();
		while(foundNumbers < 10){
			resultOne = number % dividerOne;
			System.out.println(resultOne);
			resultTwo = number % dividerTwo;
			System.out.println(resultTwo);
			if(resultOne == 0 && resultTwo != 0){
				System.out.println("Number " + number + " is divisible by " + dividerOne);
				foundNumbers++;
			}
			else if(resultOne != 0 && resultTwo == 0){
				System.out.println("Number " + number + " is divisible by " + dividerTwo);
				foundNumbers++;
			}
			else if(resultOne == 0 && resultTwo == 0){
				System.out.println("Number " + number + " is divisible by " + dividerOne + " and " + dividerTwo);
				foundNumbers++;
			}
			else{
				System.out.println("Number " + number + " isn't divisible");
				foundNumbers++;
			}
			number += 0.1;
		}
*/
	}
}
