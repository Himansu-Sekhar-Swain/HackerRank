import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        /**
        * Code copied from procon Git Hub Site.
        * I was doing cin.nextLine() because of which 2 test cases was failing... :(
        * This below copied code worked fine.
        */
        Scanner cin=new Scanner(System.in);
        try{
            int x=cin.nextInt();
            int y=cin.nextInt();

            System.out.println(x/y);

        } catch(InputMismatchException e){
            System.out.println(e.getClass().toString().substring(6));
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
