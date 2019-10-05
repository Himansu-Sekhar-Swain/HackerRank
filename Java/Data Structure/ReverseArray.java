import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  
    /**
    * By simply reading from length and reduce the index till length == 0; Time Complexity is O(1)
    * But there is one more way using >> Collections.reverse(Arrays.asList(a)); Time complexity is O(N)
    */
    static int[] reverseArray(int[] a) {
        int[] reversed = new int[a.length];
        //first way
        for(int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - (i+1)];
        }
        //second way
        Collections.reverse(Arrays.asList(a));
        for(int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - (i+1)];
        }
        return reversed;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
