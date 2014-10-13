import java.util.Scanner;
public class CalculatorClass
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Exercise 1 

System.out.print("Please write the two numbers involved in the operation(press enter after the first entry):"); 
String input1 = System.console().readLine(); 
String input2 = System.console().readLine(); //we assume the user is passing integers and not string, otherwise we should use try-catch construct
double inputvalue1 = Double.parseDouble(input1);
double inputvalue2 = Double.parseDouble(input2);
Calculator calc = new Calculator();
System.out.print("Please select the operation you want to perform(1.addition,2.subtraction,3.multiplication,4.division,0.Quit the program):"); 
int menuselection = 0;
while(menuselection < 1 || menuselection > 4) {
	if(menuselection != 0) {
		System.out.println("The selection must be between 1-4. Please select again: (1.addition,2.subtraction,3.multiplication,4.division)");
	}
	String inputmenuselection = System.console().readLine(); //we assume the user is passing integers and not string, otherwise we should use try-catch construct
	menuselection = Integer.parseInt(inputmenuselection);	
	if(menuselection == 0) {  
		break;
	}
}
if(menuselection == 1) {
	double result = calc.addition(inputvalue1,inputvalue2);
	System.out.println("That's the result " + result );
}
if(menuselection == 2) {
	double result = calc.subtraction(inputvalue1,inputvalue2);
	System.out.println("That's the result " + result );
}
if(menuselection == 3) {
	double result = calc.multiplication(inputvalue1,inputvalue2);
	System.out.println("That's the result " + result );
}
if(menuselection == 4) {
	double result = calc.division(inputvalue1,inputvalue2);
	System.out.println("That's the result " + result );
}

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


