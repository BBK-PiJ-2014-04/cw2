package calculator;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FractionCalculator {
	
	private String operator;
	private String possibleOperations = "+-*/";
	private String possibleModifiers = "";
	
	public static void main(String[] args) {
		 String input = "";
		 Fraction currentvalue = new Fraction(0,1);
		 Scanner userInput = new Scanner(System.in);
		 while(!userInput.next().isEmpty()) { // only when you enter literal string 
			 input += userInput.next();
		 }
		 FractionCalculator myCalculator = new FractionCalculator();
		 currentvalue = myCalculator.evaluate(currentvalue, input);
	}
	
	public Fraction evaluate(Fraction fraction, String inputString){
		String[] userInput = inputString.split(" ");
		if(possibleOperations.contains(inputString))
		{
			if(operator != null) {
				System.out.println("Your input is an operator, but there's already one in memory! Let's try again!");
				return new Fraction(0,1);
			}
			else
			{
				operator = inputString;
			}
		}
		/*else if() {
				
		}*/
		
		return null;
	}
}
