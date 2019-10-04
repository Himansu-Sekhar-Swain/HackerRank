import java.util.*;
import java.io.*;

class Day8DictionaryMap {
    
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.get(s) != null) {
                System.out.println(s+"="+map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
