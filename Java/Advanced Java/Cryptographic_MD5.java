import java.io.*;
import java.util.*;
import java.math.BigInteger;  
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws Exception {  
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5"); //Along with MD5 we have SHA-1 & SHA-25
        byte[] bytes = md.digest(input.getBytes(StandardCharsets.UTF_8));
        BigInteger bigInt = new BigInteger(1, bytes);
        StringBuilder sb = new StringBuilder(bigInt.toString(16));
        while(sb.length() < 32) {
            sb.insert(0, "0");
        }
        System.out.println(sb.toString());
    }
}
