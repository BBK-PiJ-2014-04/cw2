import java.util.Scanner;
public class Exercise8_Palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write your string in order to find out if it is a palindrome:"); 
String input = System.console().readLine();
int numOfIter = (int)(input.length() / 2);
int rightpart = 0;
boolean isPalindrome = true;
for(int i = 0; i < numOfIter; i++)
{
	rightpart = input.length()-i;
	System.out.println(input.substring(i,i+1) + "-" + input.substring(rightpart-1,rightpart));
	if(!input.substring(i,i+1).equals(input.substring(rightpart-1,rightpart))) {
		isPalindrome = false;
		break;
	}
}
if(isPalindrome) {
	System.out.println("The string is a palindrome");
}
else {
	System.out.println("The string isn't a palindrome");
}
}}

