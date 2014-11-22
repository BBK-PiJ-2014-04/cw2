package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FractionCalculator 
{
	
	private String operator;
	private String[] possibleOperations = {"+","-","*","/"};
	private String[] possibleModifiers = {"a","abs","n","neg","c","q"};
	public Fraction currentValue;
	
	public static void main(String[] args) 
	{
		 String input;
		 Fraction result = null;
		 Fraction initialValue = null;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 try 
		 {
			 while(true) 
			 {
				 initialValue = result;
				 input = br.readLine();
				 FractionCalculator myCalculator = new FractionCalculator();
				 if(initialValue == null)
				 {
					 initialValue = new Fraction(0,1);
				 }
				 result = myCalculator.evaluate(initialValue, input);
			 }
	      } 
		 catch (IOException ioe) 
		 {
	         System.out.println("The input generated an unexpected exception!");
	         System.exit(1);
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
			else if(Arrays.asList(possibleModifiers).contains(singleValue))
			{
			}
		}
		return currentValue;
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
			performOperation(interFraction,operator);
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
		switch(operation) 
		{
			case "+":
				currentValue.add(fraction);
				break;
			case "-":
				currentValue.subtract(fraction);
				break;
			case "/":
				currentValue.divide(fraction);
				break;
			case "*":
				currentValue.multiply(fraction);
				break;
		}
		return null;
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
