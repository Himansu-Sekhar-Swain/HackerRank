import java.util.Scanner;

public class SubStringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.List<String> list = new java.util.ArrayList<>();
        String value = "welcometojava";
        for(int x = 0; x < s.length(); x++) {
            if(x+k <= s.length()) {
                list.add(s.substring(x, x + k));
            }
        }
        java.util.Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size() - 1);
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
