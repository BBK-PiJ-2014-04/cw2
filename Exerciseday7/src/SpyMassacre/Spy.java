package SpyMassacre;


public class Spy {
	public static int spyCount;
	private int spyID;
	
	public Spy(int mySpyID) {
		spyID = mySpyID;
		spyCount++;
	}
	
	public void die() {
		 System.out.println(String.format("Spy %d has been detected and eliminated",spyID));
		 spyCount--;
		 System.out.println(String.format("%d %s remaining",spyCount,(spyCount > 1) ? "spies" : "spy"));
	}
}
