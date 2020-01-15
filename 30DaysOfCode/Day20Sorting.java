import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static void sortAndPrint(int[] a) {
        int swapCount = 0;
        for(int i = 0; i < a.length; i ++) {
            for(int j = 0; j < a.length - 1; j ++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];                    
                    a[j+1]  = temp;
                    swapCount++;
                }
            }
        }
        System.out.println("Array is sorted in "+swapCount+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        sortAndPrint(a);
    }
}

