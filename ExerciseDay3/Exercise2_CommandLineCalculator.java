import java.util.Scanner;
public class Exercise2_CommandLineCalculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write the operation (basic) you want to perform:"); 
String input = System.console().readLine(); 
String[] operationcontainer = input.split("/");
Calculator calc = new Calculator();
double first = 0;
double second = 0;
if(operationcontainer.length == 2) { //We are gonna perform just basic operation
	first = Double.parseDouble(operationcontainer[0]);
	second = Double.parseDouble(operationcontainer[1]);
	calc.division(first,second);
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
