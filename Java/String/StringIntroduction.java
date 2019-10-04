import java.io.*;
import java.util.*;

public class StringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        List<String> list = new ArrayList<>();
        int length = A.length() + B.length();
        System.out.println(length);
        list.add(A);list.add(B);
        Collections.sort(list);
        if(list.indexOf(A) <= list.indexOf(B)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
