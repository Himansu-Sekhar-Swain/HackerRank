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
                long count = 0;
        long countAinInput = 0;
        //how many 'a' are there in input string
        for (int x = 0; x < s.length(); x++) {
            if(s.charAt(x) == 'a') {
                countAinInput ++;
            }
        }
        //how many string needs to be added to make it of length n
        long divisor = n/s.length();
        count = count + divisor * countAinInput;

        //divisor will not give correct number if n is odd, calculate reminder length to add to make it n
        long reminder = n%s.length(); //this will give reminder
        for(int r = 0; r < reminder; r++) {
            if(s.charAt(r) == 'a') { // 'a' in length of s
                count++;
            }
        }

        return count;

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
