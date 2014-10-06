import java.util.Scanner;
public class Exercise5_Multiplication
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please insert the first value:");
String input = System.console().readLine();
System.out.print("Please insert the second value:");
String secondinput = System.console().readLine();

int firstmultiplier = Integer.parseInt(input);
int secondmultiplier = Integer.parseInt(secondinput);

int result = firstmultiplier * secondmultiplier;

System.out.println("This is the result of the multiplication:" + result);
}}

