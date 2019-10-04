import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        int counter = 0, xx = 0;
        for(int i = 0; i< ar.length; i++) {
            list.add(ar[i]);
        }
        for(int i = 0; i < list.size(); i++) {
            if(map.get(list.get(i)) != null) {
                map.put(list.get(i), map.get(list.get(i))+1);
            } else {
                map.put(list.get(i), 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() >= 2) {
                System.out.println(entry.getValue());
                if(entry.getValue() % 2 == 0) {
                    xx = entry.getValue() / 2;
                } else {
                    xx = (entry.getValue() - 1 ) / 2;
                }
                counter = counter + xx;
                xx = 0;
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
