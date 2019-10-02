import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    
    private static int getMaxConsucative(List<Integer> list) {
        int count = 1;
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        //List<Integer> outList = new ArrayList<Integer>();        
        for(int i = 0; i < list.size() - 1; i++) {            
            if(list.get(i) == list.get(i + 1)) {
                count++;
                //outList.add(count);
                //System.out.println(list.get(i)+"> "+count);                        
                //System.out.println("Map > "+map);
                if(map.get(list.get(i)) != null) {                    
                    if(count > map.get(list.get(i)))
                        map.put(list.get(i), count);
                } else 
                    map.put(list.get(i), count);
                
            } else {
                count = 1;
                //outList.add(count);
                //System.out.println(list.get(i)+">>> "+count);
                //map.put(list.get(i), count);
                //System.out.println("Map >>> "+map);
                if(map.get(list.get(i)) != null) {
                    if(count > map.get(list.get(i)))
                        map.put(list.get(i), count);
                } else
                    map.put(list.get(i), count);
            }
        }        
        //System.out.println(map);
        return Collections.max(map.values());
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> list = new ArrayList<>();
        do {
            list.add(n % 2);
            n = n / 2;            
        } while (n >= 1);
        System.out.println(getMaxConsucative(list));
        scanner.close();
    }
}
