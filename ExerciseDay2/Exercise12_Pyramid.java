import java.util.Scanner;
public class Exercise12_Pyramid
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int i;
int j;

for(i = 1; i < 8; i++) {
	for(j = 1; j<= i; j++) {
		System.out.print(i);
	}
	System.out.print("\n");
}
}}

