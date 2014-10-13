import java.util.Scanner;
public class CalculatorClass
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write the two numbers involved in the operation:"); 
String input1 = System.console().readLine();
String input2 = System.console().readLine();
double inputvalue1 = Double.parseDouble(input1);
double inputvalue2 = Double.parseDouble(input2);
Calculator calc = new Calculator();
double result = calc.addition(inputvalue1,inputvalue2);
System.out.println("That's the result " + result );

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


