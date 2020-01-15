import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long reqNum = 0;
        long countA = 0;
        String targetS = "";
        
        //count no of times 'a' present in 's'
        for(int x = 0; x < s.length(); x++) {
            if(s.charAt(x) == 'a') {
                countA++;
            }
        }
        System.out.println(countA);
        long reqCount = n/s.length();
        System.out.println(reqCount);
        countA = countA * reqCount;
        
        long diff = n - s.length() * reqCount;
        System.out.println(diff);
        if(diff > 0) {
            s = s.substring(0, (int)diff);
            System.out.println(countA);
            System.out.println(s);
            for(int x = 0; x < s.length(); x++) {
                if(s.charAt(x) == 'a') {
                    countA++;
                }
            }
        }
        
        return countA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
