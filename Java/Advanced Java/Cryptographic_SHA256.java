import java.io.*;
import java.util.*;
import java.math.BigInteger;  
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;

public class Solution {
    /**
    * Below method prints the hash value
    */
    static void printSHA_256_Hash(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] bytes = md.digest(input.getBytes(StandardCharsets.UTF_8));
        BigInteger bigInt = new BigInteger(1, bytes);
        StringBuilder sb = new StringBuilder(bigInt.toString(16));
        while(sb.length() < 64) { //with 32 2 test cases failed.
            sb.insert(0, "0");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        //System.out.println(input);
        try {
            printSHA_256_Hash(input);
        } catch(Exception e) {}       

    }
}

