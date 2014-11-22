package calculator;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FractionCalculator 
{
	private boolean quitProgram = false;
	private String operator;
	private String[] possibleOperations = {"+","-","*","/"};
	private String[] possibleModifiers = {"a","abs","n","neg","c","clear","q","quit"};
	public Fraction currentValue;
	
	public static void main(String[] args) 
	{
		 String input;
		 Fraction result = null;
		 Fraction initialValue = null;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 FractionCalculator myCalculator = new FractionCalculator();

		 while(true) 
		 {
			 try 
			 {
				 input = br.readLine();
				 if(initialValue == null)
				 {
					 initialValue = new Fraction(0,1);
				 }
				 result = myCalculator.evaluate(initialValue, input);
				 if(myCalculator.quitProgram)
				 {
					myCalculator.exitProgram();
				 }
				 else
				 {
					 initialValue = myCalculator.currentValue = result;
					 System.out.println(result.toString());
				 }
			 }
			 catch(EOFException eof)
			 {
				System.out.println("Goodbye");
				System.exit(1);
			 }
			 catch (IOException ioe) 
			 {
				 initialValue = new Fraction(0,1);
		         continue;
		     }
			 
			
		 } 
		 

	}
	
	public Fraction evaluate(Fraction fraction, String inputString){
		String[] userInput = inputString.split(" ");
		for( String singleValue : userInput ) 
		{
			if((singleValue.contains("/") && singleValue.split("/").length == 2) || isInteger(singleValue))
			{
				inputFunction(singleValue);
			}
			if(Arrays.asList(possibleOperations).contains(singleValue))
			{
				if(!setOperator(singleValue)) {
					return new Fraction(0,1);
				}
			}
			else if(Arrays.asList(possibleModifiers).contains(singleValue.toLowerCase()))
			{
				performModifiers(singleValue);
				if(quitProgram)
				{
					return currentValue;
				}
			}
		}
		return currentValue;
	}

	private void performModifiers(String singleValue) {
		switch(singleValue.toLowerCase()) 
		{
		case "abs":
		case "a":
			currentValue = currentValue.absValue();
			break;
		case "neg":
		case "n":
			currentValue = currentValue.negate();
			break;
		case "clear":
		case "c":
			currentValue = new Fraction(0,1);
			break;
		case "quit":
		case "q":
			quitProgram = true;
			break;
		}
	}

	private void inputFunction(String singleValue) 
	{
		Fraction interFraction;
		if(isInteger(singleValue)) 
		{
			interFraction = new Fraction(Integer.parseInt(singleValue),1);
		}
		else
		{
			interFraction = new Fraction(Integer.parseInt(singleValue.split("/")[0]),Integer.parseInt(singleValue.split("/")[1]));
		}
		if(operator == null) 
		{
			currentValue = interFraction;
		}
		else {
			currentValue = performOperation(interFraction,operator);
		}
	}
	
	public boolean setOperator(String operatorEvaluated)
	{
		if(operator != null) {
			System.out.println("Your input is an operator, but there's already one in memory! Let's try again!");
			return false;
		}
		else
		{
			operator = operatorEvaluated;
			return true;
		}
	}
	
	public Fraction performOperation(Fraction fraction,String operation)
	{
		Fraction interFraction = null;
		switch(operation) 
		{
			case "+":
				interFraction = currentValue.add(fraction);
				break;
			case "-":
				interFraction = currentValue.subtract(fraction);
				break;
			case "/":
				interFraction = currentValue.divide(fraction);
				break;
			case "*":
				interFraction = currentValue.multiply(fraction);
				break;
		}
		operator = null;
		return interFraction;
	}
	
	public void exitProgram()
	{
		 System.out.println("Thanks for using Salvatore Cardali's calculator. We hope to see you soon.");
		 System.exit(1);
	}
	
	public static boolean isInteger(String str) {
	    try 
	    {
	        Integer.parseInt(str);
	        return true;
	    } 
	    catch (NumberFormatException nfe) 
	    {
	        return false;
	    }
	}
	
}
