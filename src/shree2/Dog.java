package shree2;

public class Dog extends Animal {

	public void eat () {
	    System.out.println("Eat method of Dog!");
	    Dog.walk(3);
	    Dog.walk(9.3);
	    
	  }
	private final static void walk (int a) {
		System.out.println("walking from " + a);
	    
	  }
	private final static void walk (double d) {
		System.out.println("walking from " + d);
	}
	
}
