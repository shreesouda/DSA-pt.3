package shree2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Digitsum {
    
    static int super1(long a) {
        long count = 0, l = 0, s = 0;
        while (a > 0) {
            l = (a % 10);
            s += l;
            a = a / 10;
            count++;
        }
        if (count > 1)
            return super1(s);
        else
            return (int)l;
    }

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        long l = 0, s = 0;
        long n1 = Long.valueOf(n);
        while (n1 > 0) {
            l = n1 % 10;
            s += l;
            n1 = n1 / 10;
        }
        return super1 (s * k);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	System.out.println(superDigit("861568688536788", 100000));
    }
}

