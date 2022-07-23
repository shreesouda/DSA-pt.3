package shree2;
import java.util.*;

class tread {
	int a = 43;
	synchronized void update (int m) {
		this.a += m;
	}
}

public class Threadeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		tread td = new tread();
		int m = sc.nextInt();
		//int b = sc.nextInt();
		new Thread() {
			public void run () {
				td.update(m);
				System.out.println(td.a);
			}
		}.start();
		new Thread() {
			public void run () {
				td.update(m);
				System.out.println(td.a);
			}
		}.start();
		
	}

}
