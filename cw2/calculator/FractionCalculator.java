package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class FractionCalculator {
	
	private String operator;
	private String possibleOperations = "+-*/";
	
	public static void main(String[] args) {
		 String input;
		 Fraction currentvalue = new Fraction(0,1);
		 System.out.print(currentvalue.toString());
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 input = currentvalue + br.readLine();
			 String[] userInput = input.split(" ");
			 FractionCalculator myCalculator = new FractionCalculator();
			 for( String singleValue : userInput ) {
				 currentvalue = myCalculator.evaluate(currentvalue, singleValue);
			 }
	      } catch (IOException ioe) {
	         System.out.println("The input generated an unexpected exception!");
	         System.exit(1);
	      }
		 
	}
	
	public Fraction evaluate(Fraction fraction, String inputString){
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
		else {
					 
		}
		
		return null;
	}
}
