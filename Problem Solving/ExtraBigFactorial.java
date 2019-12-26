import java.math.BigInteger;

public class ExtraBigFactorial {
  
    public static void main(String[] a) {
    
        int N = 25;
    
        BigInteger f = new BigInteger("1");
        
        for(int i = 2; i <= N; i++) {
            BigInteger b = new BigInteger(String.valueOf(i));
            f = b.multiply(b);
        }
        
        System.out.println(f);
    }  
}
