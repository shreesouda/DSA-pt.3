package shree2;
import java.util.*;


public class MyEx extends Exception {
	
	MyEx (String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number!");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		try {
			if (a < 0) {
				MyEx s = new MyEx("Enter positive no. macha");
				throw s;
			}
			
		}
		catch (MyEx s) {
			System.out.println(s);
		}
		
		try {
			c = a/b;
		}
		/*catch (ArithmeticException ex) {
			System.out.println(ex.getClass().getName());
		}*/
		finally {
			System.out.println("done bruhh");
		}
	}

}
