import java.util.Scanner;
public class Exercise8_StackOverflow
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int i = 0;
StackOverflowFTW myclass = new StackOverflowFTW();
i = myclass.addition(1,5);

}}

class StackOverflowFTW {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	int counter = 0;	
	public int addition(int a, int b) {
		System.out.println(counter++);
		return a + b + (int)multiplication(a,b);
	}
	public double multiplication(int a, int b) {
		System.out.println(counter++);
		return division(multiplication(a,b),(double)a);
	}
	public double division(double a, double b) {
		System.out.println(counter++);
		
		return (double)addition((int)a,(int)b) / 2;
	}
}

