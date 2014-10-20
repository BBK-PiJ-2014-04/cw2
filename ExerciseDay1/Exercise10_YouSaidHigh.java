import java.util.Scanner;
public class Exercise10_YouSaidHigh
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String input;
int seqnum = 0;
int prevnum = -5; //I'm using -5 as NULL value as we're accepting just positive values
boolean consecutive = true;
while(seqnum != -1) {
	System.out.println("Please enter the next positive number of the sequence:"); 
	input = System.console().readLine();
	seqnum = Integer.parseInt(input);
	if(seqnum < -1) {
		System.out.print("Please do not enter negative values"); 
	}
	else {
		if(prevnum != -5 && seqnum != -1) {			
			if(seqnum != (prevnum + 1) && seqnum != (prevnum - 1)) {
				consecutive = false;
			}
		}
		prevnum = seqnum;
	}
}
if(consecutive) {
	System.out.println("Yes, the numbers are consecutive");
}
else {
	System.out.println("No, the numbers are not consecutive");
}

}}

