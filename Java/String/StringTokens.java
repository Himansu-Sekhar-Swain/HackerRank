import java.io.*;
import java.util.*;

//Print by space in each line
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.split("[ |'|,|!|?|.|_|@]");
        int length = 0;
        List<String> list = new ArrayList<>();
        for(int x = 0; x < tokens.length; x ++) {
            if(tokens[x].length() > 0) {
                list.add(tokens[x]);
            }
        }
        System.out.println(list.size());
        for(int x = 0; x < tokens.length; x ++) {
            if(tokens[x].length() > 0) {
                System.out.println(tokens[x]);
            }

        }
        scan.close();
    }
}
