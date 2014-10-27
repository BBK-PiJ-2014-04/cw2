import java.util.Scanner;
public class Ex2_1_FactorialWithRec
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write your number to find its factorial:"); 
String input = System.console().readLine();
int inputvalue = Integer.parseInt(input);
MyMath mymath = new MyMath();
int myFactorial = 0;
myFactorial += mymath.factorial(inputvalue);


}}

class MyMath {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public int factorial(int num) {
		System.out.print(num);
		int numFactorial = num;
		numFactorial = numFactorial * (--num);
		if(num > 1) {
			numFactorial += factorial(num);
		}
		return numFactorial;
	}
}
