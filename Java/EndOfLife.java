import java.io.*;
import java.util.*;

public class EndOfLife {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(scanner.hasNextLine() == true) {
            counter++;
            System.out.println(counter +" "+scanner.nextLine());
        }
    }
}

