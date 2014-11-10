package calculator;


public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
        new Fraction(1, 0);
        // test multiply
	Fraction f = new Fraction(3,10);
	Fraction g = new Fraction(1,2);
	Fraction h = new Fraction(3,5);
	if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
        // test equals
	test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
	test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
	test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
	test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
	test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");
	sum(new Fraction(1,2), new Fraction(1,3), new Fraction(5,6),"Sum failed");

        // extend with extra tests
    }

    static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
    
    static void sum(Fraction f1, Fraction f2, Fraction Result, String msg){
    	Fraction f3 = f1.add(f2);
    	System.out.println(String.format("%d / %d",f3.getNumerator(),f3.getDenominator()));
    	if (! f3.equals(Result))
		System.out.println(msg);
    }
}
