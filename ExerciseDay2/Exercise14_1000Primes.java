import java.util.Scanner;
public class Exercise14_1000Primes
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Here's the list of the first 1000 primes");
int i = 1;
int count = 0;
int numberToevaluate = 0;
while(i < 1000) {
	numberToevaluate++;
	boolean prime = true;
	if(numberToevaluate > 2) {
		for(int j = 2; j < numberToevaluate; j++) {
			if(numberToevaluate % j == 0) {
				prime = false;
				break;
			}
		}
	}
	if(prime || i < 3) {
		count++;
		if(numberToevaluate == 1) {
			System.out.print(numberToevaluate);
		}
		else {
			System.out.print("," + numberToevaluate);
		}
		i++;
		if(count % 10 == 0) {
			System.out.println("");
		}
	}
}
System.out.println("");
}}

