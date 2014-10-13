import java.util.Scanner;
public class Exercise2_CommandLineCalculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write the operation (basic) you want to perform:"); 
String input = System.console().readLine(); 
Calculator calc = new Calculator();
double first = 0;
double second = 0;
double result = 0;
int operation = 0;
int i = 0;
String[] possibleOperations = {"/","\\+","-","\\*"}; //Apparently + and * are meta characters. I added the "\\" as escape character
for(i = 1; i < 5; i++) {
	String[] operationcontainer = input.split(possibleOperations[i-1]);
	if(operationcontainer.length == 2) {	
		first = Double.parseDouble(operationcontainer[0]);
		second = Double.parseDouble(operationcontainer[1]);
		operation = i-1;
		break;
	}
}

if(operation == 1) {
	result = calc.addition(first,second);
	System.out.println("That's the result " + result );
}
if(operation == 2) {
	result = calc.subtraction(first,second);
	System.out.println("That's the result " + result );
}
if(operation == 3) {
	result = calc.multiplication(first,second);
	System.out.println("That's the result " + result );
}
if(operation == 0) {
	result = calc.division(first,second);
	System.out.println("That's the result " + result );
}


//I will use the same class used in the previous exercise
}}

class Calculator {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	
	double addition(double first,double second) {
		return first+second;
	}
	
	double subtraction(double first,double second) {
				return first-second;
		}
	double multiplication(double first,double second) {
			return first*second;
	}
	double division(double first,double second) {
			return first/second;
	}
	
}
