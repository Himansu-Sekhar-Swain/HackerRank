import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WaysToIterateMap {

    public static void main(String[] s) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "aa");
        map.put("B", "bb");
        map.put("C", "cc");

        /**
         * 1. Entry Set
         */

        for(Map.Entry<String, String> set : map.entrySet()) {
            System.out.print(set.getKey()+" : "+set.getValue());
        }

        /**
         * 2. Stream
         */
        map.forEach((k, v) -> {
            System.out.print(k+" : "+v);
        });

        /**
         * 3. key set
         */
        for(String key : map.keySet()) {
            System.out.print(key +" : "+map.get(key));
        }

        /**
         * 4. Iterator
         */

        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator iterator = ((Set) set).iterator();
    }
}
