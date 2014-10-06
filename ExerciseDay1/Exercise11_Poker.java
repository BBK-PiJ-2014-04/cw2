import java.util.Scanner;
public class Exercise11_Poker
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

boolean valid = false;
boolean cardnumber = true;
System.out.print("Please insert a valid first card:");

while(!valid) {
	String input = System.console().readLine();
	int firstvalue = Integer.parseInt(input);	
	int i = 1;
	while(i < 11) {
		if(value == i) {
			cardnumber = true;
			continue;
		}
	}		
}

System.out.print("Please insert the second card:");
String secondinput = System.console().readLine();

System.out.print("Please insert the third card:");
String thirdinput = System.console().readLine();

System.out.print("Please insert the fourth card:");
String secondinput = System.console().readLine();

System.out.print("Please insert the fifth card:");
String thirdinput = System.console().readLine();
}}

