import java.util.Scanner;
public class Exercise4_LineToColumn
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Please enter your sentence"); 
input1 = System.console().readLine();

for(int i = 0; i < input1.length; i++) {
	System.out.println(input1.charAt(i));
}

for(int m = 0; m < input1.length; m++) {
	if(input1.charAt(m).equals(" ")) {
		System.out.println("");
	}
	else {
		System.out.print(input1.charAt(i));
	}
}
}}

