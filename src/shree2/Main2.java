package shree2;

//multiple classes/interfaces in a single file.

interface Someinter {
	int k = 2;
	public void view();
	void eat();
	void walk();
}

abstract class Someclass implements Someinter {
	public void display () {
		System.out.println("Inside Someclass class and display method!");
	}
	public void view () {
		System.out.println("Inside view method of interface!");
	}
	public void eat () {
		System.out.println("Inside eat method of interface!");
	}
	public void walk () {
		System.out.println("inside walk of Someclass2!");
	}
}

class Someclass2 extends Someclass {
	/*public void walk () {
		System.out.println("inside walk of Someclass2!");
	}*/
}

class Main2 {
	
	static int sum (int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 34;
		System.out.println(sum(a, b));
		Someclass2 sc = new Someclass2();
		sc.display();
		sc.eat();
		sc.view();
	}

}
