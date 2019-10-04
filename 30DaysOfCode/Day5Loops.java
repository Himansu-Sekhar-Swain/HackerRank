import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    
    //Creates multiple table of a number 'n'
    private static void printMultiple(int n) {
        int counter = 10;
        for(int i = 1; i <= counter; i++) {
            int multiple = n * i;
            System.out.println(n + " x " +i+" = "+multiple);
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printMultiple(n);
        scanner.close();
    }
}
