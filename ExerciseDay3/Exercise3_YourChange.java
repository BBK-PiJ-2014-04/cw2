import java.util.Scanner;
public class Exercise3_YourChange
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String input1;
String input2;
double cost = 0.1;
double paid = 0;

while(paid < cost) {
	System.out.println("Please enter the cost of the product:"); 
	input1 = System.console().readLine();
	cost = Double.parseDouble(input1);
	System.out.println("Please enter the amount paid of the product:"); 
	input2 = System.console().readLine();
	paid = Double.parseDouble(input2);
	if(paid < cost) {
		System.out.println("Sorry, no discounts in this shop.");
	}
}

//we assume that the user is kind and he's inserting valid input, I'm waiting that we introduce the try..catch construct to do some exception managment :D
double[] notes = {50,20,10,5};
double[] coins = {2,1,0.5,0.2,0.1,0.05,0.02,0.01};
double change = paid - cost;
System.out.println("The change is " + change + " composed as follows:");
int count = 0;
int numberof = 0;
int value = 0;
while(change > 4.99) {
	numberof = (int)(change % notes[count]);
	value = (int)notes[count];
	System.out.println( numberof + ((numberof < 2) ? " note" : " notes") + " of " + value);
	change = change - ((numberof) * value);
	count++;
}
count = 0;
numberof = 0;
while(change > 0) {
	numberof = (int)(change % coins[count]);
	value = (int)coins[count];
	System.out.println( numberof + ((numberof < 2) ? " coin" : " coins") + " of " + value);
	change = change - ((numberof) * value);
	count++;
}
}}

