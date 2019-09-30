import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String action_in = "Insert";
        String action_rm = "Delete";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for(int x = 0; x < q; x++) {
            String action = scanner.next();
            if(action.equals(action_in)) {
                int in_index = scanner.nextInt();
                int in_value = scanner.nextInt();
                list.add(in_index, in_value);
            }
            if(action.equals(action_rm)) {
                int rm_index = scanner.nextInt();
                list.remove(rm_index);
            }
        }
        for(int i : list) {
            System.out.print(i+" ");
        }
        
    }
}
