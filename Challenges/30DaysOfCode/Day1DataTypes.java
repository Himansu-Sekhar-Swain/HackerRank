import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String s2 = "";
        //this is important to read the next line
        while(scan.hasNext()) {
            s2 = scan.nextLine();
        }       

        i2 = i2 + i;
        System.out.println(i2);
        d2 = d2 + d;
        System.out.printf("%.1f", d2);
        System.out.println("\n"+s+s2);

        scan.close();
    }
}
