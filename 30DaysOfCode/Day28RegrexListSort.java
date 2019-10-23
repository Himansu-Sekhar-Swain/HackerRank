import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String regrex = ".+@gmail\\.com$";
 
        Pattern p = Pattern.compile(regrex);       
        List<String> list = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String name = firstNameEmailID[0];
            String email = firstNameEmailID[1];

            Matcher m = p.matcher(email);

            if(m.find()) {
                list.add(name);
            }            
        }

        Collections.sort(list);

        for(String s : list) {
            System.out.println(s);
        }

        scanner.close();
    }
}
