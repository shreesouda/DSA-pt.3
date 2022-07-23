package shree2;

public class Inherit {
	
	//related to dog and animal class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal al = new Animal();
		Animal d = new Dog();//upcasting
		Dog d2 = new Dog();
		d.eat();
		//if (d instanceof Animal)
			Dog al2 = (Dog)d;
		al2.eat();
	    d2.eat();
	   

	}

	
}
