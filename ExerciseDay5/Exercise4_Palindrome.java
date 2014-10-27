import java.util.Scanner;
public class Exercise4_Palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write your string in order to find out if it is a palindrome:"); 
String input = System.console().readLine();
int index = 0;
boolean isPalindrome = MyStringsOp.PalindromChecker(input,index);
if(isPalindrome) {
	System.out.println("The string is a palindrome");
}
else {
	System.out.println("The string isn't a palindrome");
}



}}

class MyStringsOp {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static boolean PalindromChecker(String mystring,int index) {
		if(index > (mystring.length() / 2)) {
			return true;
		}
		int rightpart = mystring.length()-index;
		if(!mystring.substring(index,index+1).equals(mystring.substring(rightpart-1,rightpart))) {
			return false;
		}
		else {
			return MyStringsOp.PalindromChecker(mystring,++index);
		}
	}
}
