import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//HashSet : allows one null and faster unlike TreeSet as it does not spend time in ordering the collection. TimeComplexisty O(1).

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet set = new HashSet();
        int count = 0;
        for(int i = 0; i < t; i++) {
            String pair = pair_left[i]+","+pair_right[i];
            if(!set.contains(pair)) {
                set.add(pair);
                count++;
                //if hashset does not contain print same count ++
                System.out.println(count);
            } else {
                //if hashset contains print same count
                System.out.println(count);
            }           
        }
   }
