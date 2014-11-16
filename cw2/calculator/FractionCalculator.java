package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionCalculator {
	public static void main(String[] args) {
		 String input;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 input = br.readLine();
			 System.out.println(input);
	      } catch (IOException ioe) {
	         System.out.println("The input generated an unexpected exception!");
	         System.exit(1);
	      }
		 
	}
}
