import java.io.*;
import java.util.*;
import java.math.*;

public class BigNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        BigInteger int1 = new BigInteger(sc.next());
        BigInteger int2 = new BigInteger(sc.next());

        //System.out.println(int1+" : "+int2);

        System.out.println(int1.add(int2));
        System.out.println(int1.multiply(int2));
    }
}
