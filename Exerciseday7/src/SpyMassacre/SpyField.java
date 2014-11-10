package SpyMassacre;

import java.util.Random;

public class SpyField {
	 public static void main(String[] args) {
		 int[] i = {1,2,3,4,5};
		 Spy mySpy = new Spy(i[0]); 
		 Spy myOtherSpy = new Spy(i[1]);
		 Spy myGoodSpy = new Spy(i[2]);
		 Spy myBadspy = new Spy(i[3]); 
		 Spy doubleOSeven = new Spy(i[4]); //Let's create an army of 5 spies
		 Spy.spyCount = 5;
		 
		 int m = 5;//This is my random sniper, he has 5 shot(m)!
		 int randomInt = 0;
		 while(m > 0) {
			 Random randomGenerator = new Random();
			 randomInt = randomGenerator.nextInt(15);
			 System.out.println("Fire!");
			 switch(randomInt) {
				 case 1:
					 mySpy.die();
					 break;
				 case 2:
					 myOtherSpy.die();
					 break;
				 case 3:
					 myGoodSpy.die();
					 break;
				 case 4:
					 myBadspy.die();
					 break;
				 case 5:
					 doubleOSeven.die();
					 break;
				 default:
					 System.out.println("Missed!");
					 break;
			 }
			 m--;
		 }
	 }
}
