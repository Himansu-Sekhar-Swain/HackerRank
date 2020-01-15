import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int x, String s) {
        int level = 0;
        int valleys = 0;
        boolean belowSea = false;

        for(int n = 0; n < s.length(); n++) {
            if(s.charAt(n) == 'U') {
                level ++;
            } else {
                level --;
            }

            if(!belowSea  && level < 0) {
                valleys ++;
                belowSea = true;
            }

            if(level >= 0) {
                belowSea = false;
            }
        }
        return valleys;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
