import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    //Constructor initialize elements
    Difference(int[] elements) {
        this.elements = elements;
    }
	  
    //Loop the elements to find the abs diff.
    public void computeDifference() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < elements.length; i++) {
            for(int j = 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                //System.out.println(elements[i] +" - "+ elements[j] +" = "+ diff); 
                list.add(diff);
            }
        }
        //Another way to get max is : Store diff in an Array and then Sort it. Max = array[array.length - 1];
        maximumDifference = Collections.max(list); 
    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
