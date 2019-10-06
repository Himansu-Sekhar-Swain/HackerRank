import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);
    //certainity 10 solves all test cases
    public static void main(String[] args) {
        BigInteger bi = scan.nextBigInteger();
        System.out.println(bi.isProbablePrime(10) ? "prime" : "not prime");
        scan.close();
    }
}
