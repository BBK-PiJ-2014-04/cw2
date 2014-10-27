import java.util.Scanner;
public class Exercise15_GuessMyNumber
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
double numberToGuess = Math.abs(1000 * Math.random());
int input = -1;
int guesses = 0;
System.out.println("Try to guess my number!");
while(true) {
	System.out.print("Tell me a number:");
	String value = System.console().readLine();
	int inputvalue = Integer.parseInt(value);
	if((int)numberToGuess == inputvalue) {
		System.out.println("Correct!");
		System.out.println("You needed " + guesses + " guesses");
		break;
	}
	else {
		guesses++;
		String output = "No! my number is" + (inputvalue < numberToGuess ? " higher" : " lower");
		System.out.println(output);
	}
}
}}

