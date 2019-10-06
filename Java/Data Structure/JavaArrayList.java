import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void printList(List<String> list) {
        int set1 = Integer.parseInt(list.get(0));
        int set2 = Integer.parseInt(list.get(set1 + 1));
        List<String> set1List = new ArrayList<>();
        List<String> set2List = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for(int x1 = 1; x1 <= set1; x1++) {
            set1List.add(list.get(x1));
        }
        for(int x1 = set1 + 2; x1 < list.size(); x1++) {
            set2List.add(list.get(x1));
        }
        for(int i = 0; i < set2List.size(); i++) {
            String index = set2List.get(i);
            String[] indices = index.split(" ");            
            String targetString = set1List.get(Integer.parseInt(indices[0]) - 1);
            String[] targets = targetString.split(" ");
            if(targets.length <= Integer.parseInt(indices[1])) {
                System.out.println("ERROR!");
            } else {
                System.out.println(targets[Integer.parseInt(indices[1])]);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        List<String> inputList = new ArrayList<String>();
        while(in.hasNext()) {
            inputList.add(in.nextLine());
        }
        //System.out.println(inputList);
        Solution.printList(inputList);
    }
}
