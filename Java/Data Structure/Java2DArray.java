import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    private static void printMaxHourGlass(int[][] arr){

        int max = -1000;

        for(int row = 0; row < arr.length - 2; row ++) {
            for(int col = 0; col < arr[row].length - 2; col++) {
                int top_HG = arr[row][col] + arr[row][col+1] + arr[row][col+2];
                int middle_HG = arr[row+1][col+1];
                int bottom_HG = arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];

                if(top_HG + middle_HG + bottom_HG > max) {
                    max = top_HG + middle_HG + bottom_HG;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        printMaxHourGlass(arr);

        scanner.close();
    }
}
