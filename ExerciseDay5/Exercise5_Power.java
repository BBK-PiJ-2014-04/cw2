import java.util.Scanner;
public class Exercise5_Power
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please provide a base:");
String value = System.console().readLine();
int base = Integer.parseInt(value);
System.out.print("Please provide an exponent:");
String value2 = System.console().readLine();
int exponent = Integer.parseInt(value2);
System.out.println("Your Power is: " + MathOps2.pow(base,exponent));

}}

class MathOps2 {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static int pow(int base,int exp) {
		if(exp > 0) {
			return base*pow(base,--exp);
		}
		else {
			return 1;
		}
	}
}
