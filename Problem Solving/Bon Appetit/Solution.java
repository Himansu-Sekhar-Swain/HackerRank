import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        //System.out.println("bill : "+bill);
        int amount = bill.get(k);
        int totalBillAmt = 0;
        //System.out.println("Anna Charged : "+amount);
        for(Integer i : bill) {
            totalBillAmt = totalBillAmt + i;
        }
        totalBillAmt = totalBillAmt - amount;
        //System.out.println("totalBillAmt : "+totalBillAmt);
        if(totalBillAmt % 2 == 0) {            
            if (b > totalBillAmt % 2) {
                int extra = b - totalBillAmt/2;                
                if(extra == 0) {
                    System.out.println("Bon Appetit");
                } else {
                    System.out.println(extra);    
                }
            } else {
                System.out.println("Bon Appetit");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] billItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billItems[i]);
            bill.add(billItem);
        }

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
