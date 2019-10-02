import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static int reverse(int j) {
        Integer in = new Integer(j);
        String num = "";
        //System.out.println("Length : "+in.toString().length());
        for(int x = in.toString().length(); x > 0; x--) {
            //System.out.println(in.toString().charAt(i-1));
            num = num + in.toString().charAt(x -1);
        }
        //System.out.println(num);        
        return Integer.parseInt(num);
    }
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for(int x = i; x <= j; x++) {
            int rev = reverse(x);
            if(Math.abs(x - rev) % k == 0) {
                count ++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
