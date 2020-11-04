import java.math.*;
import java.util.Scanner;
public class WholeDivision{

	private BigInteger numberToDivide;
	private BigInteger dividerOne;
	private BigInteger dividerTwo;
	private int totalNumbers;

	public WholeDivision(Scanner input){
		System.out.print("Enter what number you want to start at: ");
		this.numberToDivide = new BigInteger(input.next());
		System.out.print("Enter the first divider: ");
		this.dividerOne = new BigInteger(input.next());
		System.out.print("Enter the second divider: ");
		this.dividerTwo = new BigInteger(input.next());
		System.out.print("Enter how many numbers you want to find: ");
		this.totalNumbers = input.nextInt();
	}

	public void divide(){
		int foundNumbers = 0;
                while(foundNumbers < this.totalNumbers){
                        if(BigInteger.ZERO.equals(numberToDivide.mod(dividerOne))){
                                System.out.println(numberToDivide + " is divisible by " + dividerOne);
                                foundNumbers++;
                                System.out.println("Found " + foundNumbers);
                        }
                        else if(BigInteger.ZERO.equals(numberToDivide.mod(dividerTwo))){
                                System.out.println(numberToDivide + " is divisible by " + dividerTwo);
                                foundNumbers++;
                                System.out.println("Found " + foundNumbers);
                        }
                        numberToDivide = numberToDivide.add(BigInteger.ONE);
                }
	}
}
