import java.math.*;

public class Homework10_16{
	public static void main(String[] args){
		/*(Divisible by 2 or 3)
		Find the first ten numbers with 50 decimal digits
		that are divisible by 2 or 3.*/
		StopWatch timer = new StopWatch();

		String numberGet = "1";
		for(int i = 0; i < 49; i++){
			numberGet += "0";
		}

		BigDecimal number = new BigDecimal(numberGet);
		BigDecimal divisorOne = new BigDecimal("2");
		BigDecimal divisorTwo = new BigDecimal("3");
		BigDecimal resultOne;
		BigDecimal resultTwo;

		timer.start();
		int numberCount = 0;
		while(numberCount < 10){
			resultOne = number.remainder(divisorOne);
			resultTwo = number.remainder(divisorTwo);
			if(resultOne.equals(BigDecimal.ZERO) || resultTwo.equals(BigDecimal.ZERO)){
				numberCount++;
				System.out.println(numberCount + ": " + number + " is divisible by 2 or 3");
			}
			number = number.add(BigDecimal.ONE);
		}
		timer.stop();
	}
}
