package shree2;
import java.util.*;

public class Statblock {
	static int j;
	static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("Enter i");
		int i = sc.nextInt();
		if (i == 0)
			j = 0;
		else
			j = -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(j);

	}

}
