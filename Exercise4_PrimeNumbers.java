import java.util.Scanner;
public class Exercise4_PrimeNumbers
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

System.out.print("Please write your number here to verify if it is a prime number:"); 
String input = System.console().readLine();
boolean prime = true;
int inputvalue = Integer.parseInt(input);
if(inputvalue > 0) {
	if(inputvalue > 2) {
		for(int i = 2; i < inputvalue; i++) {
			if(inputvalue % i == 0) {
				prime = false;
				break;
			}
		}
	}
	if(prime || inputvalue < 3) {
		System.out.println("The number you submitted is a prime number");
	}
	else
	{
		System.out.println("The number you submitted is not a prime number");
	}
}
else
{
	System.out.println("The input is invalid. Please do not insert strings or numbers lower than 1");
}
}}

