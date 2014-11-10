package SpyMassacre;

public class SpyField {
	 public static void main(String[] args) {
		 int[] i = {1,2,3,4,5};
		 Spy mySpy = new Spy(i[0]); 
		 Spy myOtherSpy = new Spy(i[1]);
		 Spy myGoodSpy = new Spy(i[2]);
		 Spy myBadspy = new Spy(i[3]); 
		 Spy doubleOSeven = new Spy(i[4]); //Let's create an army of 10 spies
	 }
}
