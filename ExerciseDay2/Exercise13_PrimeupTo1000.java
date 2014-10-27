import java.util.Scanner;
public class Exercise13_PrimeupTo1000
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Here's the list of all the prime numbers lower that 1000");
int count = 0;
for(int i = 1; i <= 1000; i++) {
	boolean prime = true;
	if(i > 2) {
		for(int j = 2; j < i; j++) {
			if(i % j == 0) {
				prime = false;
				break;
			}
		}
	}
	if(prime || i < 3) {
		count++;
		if(i == 1) {
			System.out.print(i);
		}
		else {
			System.out.print("," + i);
		}
		if(count % 10 == 0) {
			System.out.println("");
		}
	}
}
System.out.println("");
}}

