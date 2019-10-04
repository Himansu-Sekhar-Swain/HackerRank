import java.io.*;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A == null) {
            System.out.println("No value.");
        }

        String original = A;
        String reverse = "";
        List<Character> list = new ArrayList<>();
        for (int x = 0; x < original.length(); x++) {
            list.add(original.charAt(x));
        }
        Collections.reverse(list);
        for (int x = 0; x < list.size(); x++) {
            reverse = reverse + list.get(x)+"";
        }
        if(original.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }       
    }
}
