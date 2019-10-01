import java.io.*;
import java.util.*;

public class Solution {

    private static int printSubArrayCount(int[] arr) {
        int count = 0;        
        for(int n = 0; n < arr.length; n++) {
            int sum = 0;
            for(int j = n; j < arr.length; j++) {
                sum += arr[j];
                if(sum < 0) {
                    count ++;
                }
            }            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        int count = printSubArrayCount(arr);
        System.out.println(count);
    }
}
