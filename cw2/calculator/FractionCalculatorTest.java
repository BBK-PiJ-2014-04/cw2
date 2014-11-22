package calculator;


public class FractionCalculatorTest {
	public static void main(String[] args) {
		
		
		//Test if the correct input is taken, as if we don't have any operation the starting input should be changed
		System.out.println((testInputSequence("7 9 12",new Fraction(12,4))) ? "ok" : "not ok");
		System.out.println((testInputSequence("7/4 9/44 2/3",new Fraction(2,3))) ? "ok" : "not ok");
		System.out.println((testInputSequence("7/4 9/44 4/6",new Fraction(2,3))) ? "ok" : "not ok");
		System.out.println((testInputSequence("1/2 3/3 6/8",new Fraction(3,3))) ? "ok" : "not ok");
		
		//Test the operations
		System.out.println((testInputSequence("7 + 9 + 12",new Fraction(12,4))) ? "ok" : "not ok");
		System.out.println((testInputSequence("7 + 9 + 12",new Fraction(28,1))) ? "ok" : "not ok");
		System.out.println((testInputSequence("7/2 + 9/2 + 12/2",new Fraction(28,2))) ? "ok" : "not ok");
		System.out.println((testInputSequence("7/5 - 9/2 * 12/2 / 7/9 + 3",new Fraction(-732,35))) ? "ok" : "not ok");
		System.out.println((testInputSequence("1/-2 3/2 * 7/2 * 1/3",new Fraction(-7,4))) ? "ok" : "not ok");
		System.out.println((testInputSequence("1/-2 3/2 * 7/2 * 1/3",new Fraction(7,4))) ? "ok" : "not ok");
		System.out.println((testInputSequence("1/-2 3/2 * -7/2 * 1/3",new Fraction(7,-4))) ? "ok" : "not ok");
	
		//Test the absolute and negate (not implemented yet, I want to try the "sure failing" tests
		System.out.println((testInputSequence("2/-3 neg",new Fraction(2,3))) ? "ok" : "not ok");
		System.out.println((testInputSequence("1/-2 3/2 * 7/2 * 1/3 neg",new Fraction(-7,4))) ? "ok" : "not ok");
	}
	
	public static boolean testInputSequence(String input,Fraction result)
	{
		FractionCalculator calc = new FractionCalculator();
		Fraction myfraction = calc.evaluate(new Fraction(0,1), input);
		return myfraction.equals(result);
	}
}
