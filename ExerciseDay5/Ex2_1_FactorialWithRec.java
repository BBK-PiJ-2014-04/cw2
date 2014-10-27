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
myFactorial = mymath.factorial(inputvalue);
System.out.println(myFactorial);


}}

class MyMath {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public int factorial(int num) {
		int numFactorial = num;
		if(num > 1) {
			numFactorial = numFactorial * factorial(--num);
		}
		return numFactorial;
	}
}
