package shree2;
import java.util.*;

public class Threadegmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();*/
		//Threadeg td = new Threadeg();
		Thread tr = new Thread(new Threadeg());
		tr.start();
		while (tr.isAlive()) {
			System.out.println("Waiting for thread to finish");
		}
		for (int i = 0; i < 10; i++)
			System.out.println("Hi there");
		//Threadeg td1 = new Threadeg();
		//td1.start();
		Thread tr2 = new Thread(new Threadeg());
		tr2.start();
	}

}
