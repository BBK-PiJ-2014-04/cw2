import java.util.Scanner;
public class Ex2_1_FactorialWithIter
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write your number to find its factorial:"); 
String input = System.console().readLine();
int inputvalue = Integer.parseInt(input);
int factorial = inputvalue;
while(inputvalue > 1) {
	factorial = factorial * (--inputvalue);
}
System.out.println("Here's the factorial of the number you have chosen: " + factorial);
}}

