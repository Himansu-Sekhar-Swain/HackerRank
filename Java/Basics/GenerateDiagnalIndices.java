import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GenerateDiagnalIndices {

    public static List<Integer> getIndices(int matrix) {
        List<Integer> list = new ArrayList<>();
        int diff = matrix + 1;

        for(int x = 0; x < matrix; x++) {
            int index = x * (matrix + 1) ;
            list.add(index);
        }
        //System.out.println(list);
        for(int x = 0; x < matrix; x++) {
            int index = (matrix - 1) * (x + 1) ;
            list.add(index);
        }
        System.out.println(list);
        return  list;
    }

    public static void main(String [] a) {

        Map<String, Integer> inputMap = new LinkedHashMap<>();
        inputMap.put("9-Dimension", 9);
        inputMap.put("5-Dimension", 5);

        for(Map.Entry<String, Integer> map : inputMap.entrySet()) {
            System.out.println("For "+map.getKey()+" indices are ...");
            GenerateDiagnalIndices.getIndices(map.getValue());
            System.out.println("-------------------------------------------------------------------");
        }

    }
}
