import java.util.Scanner;
public class Exercise7_NaiveSorting
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please insert the first value:");
String input = System.console().readLine();
System.out.print("Please insert the second value:");
String secondinput = System.console().readLine();
System.out.print("Please insert the third value:");
String thirdinput = System.console().readLine();

int first = Integer.parseInt(input);
int second = Integer.parseInt(secondinput);
int third = Integer.parseInt(thirdinput);


if(first < second) {
	if(second < third) {
		System.out.println("The List is " + first + "," + second + "," + third);
	}
	else {
		if(first < third) {
			System.out.println("The List is " + first + "," + third + "," + second);
		}
		else
		{
			System.out.println("The List is " + third + "," + first + "," + second);
		}
	}
}
else { 
	if(first < third) {
		System.out.println("The List is " + second + "," + first + "," + third);
	}
	else {
		if(second < third) {
			System.out.println("The List is " + second + "," + third + "," + first);
		}
		else
		{
			System.out.println("The List is " + third + "," + second + "," + first);
		}
	}
}
}}

