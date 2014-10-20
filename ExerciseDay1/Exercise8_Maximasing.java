import java.util.Scanner;
public class Exercise8_Maximasing
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String input;
int seqnum = 0;
int maxnum = 0;
while(seqnum != -1) {
	System.out.println("Please enter the next positive number of the sequence:"); 
	input = System.console().readLine();
	seqnum = Integer.parseInt(input);
	if(seqnum < -1) {
		System.out.println("Please do not enter negative values"); 
	}
	if(maxnum == 0 || seqnum > maxnum) {
		maxnum = seqnum;
	}
}
System.out.println("The maximum number of the sequence is: " + maxnum);
}}

