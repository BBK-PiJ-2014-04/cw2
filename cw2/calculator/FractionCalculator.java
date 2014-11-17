package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class FractionCalculator {
	
	private String operator;
	String[] possibleOperations = {'+','-','*','/'};
	
	public static void main(String[] args) {
		 String input;
		 Fraction currentvalue = new Fraction(0,1);
		 System.out.print(currentvalue.toString());
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 input = currentvalue + br.readLine();
			 String[] userInput = input.split("-");
			 for( String singleValue : userInput ) {
				 currentvalue = evaluate(currentvalue, singleValue);
			 }
	      } catch (IOException ioe) {
	         System.out.println("The input generated an unexpected exception!");
	         System.exit(1);
	      }
		 
	}
	
	public static Fraction evaluate(Fraction fraction, String inputString){
		if.contains)
		switch(inputString) {
			 case "+":
				 break;
			 case "-":	
				 break;
			 case "*":
				 break;
			 case "/":	
				 break;
			 default:
		 }
		
		return null;
	}
}
