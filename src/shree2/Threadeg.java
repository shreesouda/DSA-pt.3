package shree2;
import java.util.*;

public class Threadeg implements Runnable {
	
	Scanner sc = new Scanner(System.in);

	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++)
			System.out.println("Hi there within thread");
		/*System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		System.out.println("Sum " + (a+b));*/

	}

}
