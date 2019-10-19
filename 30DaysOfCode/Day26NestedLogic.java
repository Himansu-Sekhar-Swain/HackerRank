import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /**
    *  Calculate fine
    */
    private static int fine(String actual, String expected) {
        int fineAmt = 0;
        /**
        * Another way of getting input from Scanner will be just : s.next();
        */
        int ac_dt = Integer.parseInt(actual.split(" ")[0]);
        int ac_mon = Integer.parseInt(actual.split(" ")[1]);
        int ac_yr = Integer.parseInt(actual.split(" ")[2]);
        int ex_dt = Integer.parseInt(expected.split(" ")[0]);
        int ex_mon = Integer.parseInt(expected.split(" ")[1]);
        int ex_yr = Integer.parseInt(expected.split(" ")[2]);
      
        if(ac_yr > ex_yr) {
            fineAmt = 10000;
        } else if(ac_yr == ex_yr) {
            if(ac_mon > ex_mon) {
                fineAmt = 500 * (ac_mon - ex_mon);
            } else if(ex_mon == ac_mon && ac_dt > ex_dt) {
                fineAmt = 15 * (ac_dt - ex_dt);
            }
        }
        return fineAmt;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String actual = s.nextLine();
        String expected = s.nextLine();
        int amt = fine(actual, expected);
        System.out.println(amt);
    }
}
