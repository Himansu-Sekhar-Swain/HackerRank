import java.io.*;
import java.util.*;

public class Solution {

    private static void printInput(String input) {
        String evenString = ""; 
        String oddString = "";

        for(int i = 0; i < input.length(); i++) {
            if(i % 2 == 0) {
                evenString = evenString + input.substring(i, i+1);
            } else {
                oddString = oddString  + input.substring(i, i+1);
            }
        }
        System.out.println(evenString+" "+oddString);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i++) {
            String input = scan.nextLine();
            printInput(input);
        }
        
        //scanner.close();
    }
}

