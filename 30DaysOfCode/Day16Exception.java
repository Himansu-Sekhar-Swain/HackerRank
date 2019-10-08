import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /**
    * Try to parse String 's' if it is an integer then it will parse else it will get
    * trapped in catch block.
    */
    private static void printValue(String s) {
        try {
            int intValue = Integer.parseInt(s);
            System.out.println(intValue);
        } catch(Exception e) {
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        printValue(S);
    }
}

