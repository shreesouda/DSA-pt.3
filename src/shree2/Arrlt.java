package shree2;
import java.util.*;


public class Arrlt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(100);
		al.add("Hello");
		al.add("there!");
		int a = (Integer)al.get(0);
		Object s = al.get(2);
		String str = (String)s;
		System.out.println(str + " " + a);

	}

}
