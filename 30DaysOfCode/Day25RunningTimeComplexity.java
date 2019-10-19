import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /**
    * Check if n is prime or not
    */
    private static boolean isPrime(int n) {
        //If you count till n and find the multiple then time complexity will be huge so Hackerrank suggested to go for SQRT.
        for(int x = 2; x <= (int)Math.sqrt(n); x++) {
            if(n % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int in = s.nextInt();
            if(in >= 2 && isPrime(in)) {
                System.out.println("Prime");
            } else {
                //All positive number less than 2 are not prime Ex. 1
                System.out.println("Not prime");
            }
        }
    }
}
