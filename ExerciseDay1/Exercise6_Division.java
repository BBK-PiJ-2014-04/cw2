import java.util.Scanner;
public class Exercise6_Division
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please insert the first value:");
String input = System.console().readLine();
System.out.print("Please insert the second value:");
String secondinput = System.console().readLine();

int first = Integer.parseInt(input);
int second = Integer.parseInt(secondinput);

int Dividend;
int Divisor;

if(first > second) {
	Dividend = first;
	Divisor = second;
}
else {
	Dividend = second;
	Divisor = first;
}

int count = 0;
while(Dividend >= (Divisor * (count+1))) {
	count ++;
}

int remainder = (Dividend - Divisor * count);

System.out.println("The result of the Division is:" + count);
System.out.println("The remainder of the Division is:" + remainder);
}}

