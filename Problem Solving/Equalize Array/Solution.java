import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        int counter = 0;
        int repeated = 0;
        Map<String, Integer> map = new LinkedHashMap<>();

        for(int x = 0; x < arr.length; x++) {
            String key = arr[x]+"";
            if(map.get(key) != null) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
        int max = Collections.max(map.values());
        if(max == 1) {
            counter = arr.length - 1;
        } else {
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue() != max) {
                    counter = counter + entry.getValue();
                } else {
                    repeated ++;
                }
            }   
        }
        System.out.println(repeated);
        if(max == 1) {
           return counter;
        } else {
            return counter + max * (repeated -1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
