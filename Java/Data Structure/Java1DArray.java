import java.util.*;

//2nd test case is not right as per HackerRank. This will solve only 1st test case.
public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            int x = scan.nextInt();
            a[i] = x;
        }
        Arrays.sort(a); //Do not break head...Just call 'Sort' method from Arrays class.
        scan.close();

        /**
	* Prints each sequential element in array a
	*/
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
