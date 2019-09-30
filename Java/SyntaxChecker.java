import java.util.Scanner;
import java.util.regex.*;

public class SyntaxChecker {

	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);		
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i ++) {
            String pattern = sc.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
