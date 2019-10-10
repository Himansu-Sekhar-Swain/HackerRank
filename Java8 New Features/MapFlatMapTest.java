import java.util.*;
import java.util.stream.Collectors;

public class MapFlatMapTest {

    public List<List<String>> getList() {
        List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
        List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");

        List<List<String>> hogwarts = new ArrayList<>();
        hogwarts.add(houseGryffindor);
        hogwarts.add(houseHufflepuff);
        hogwarts.add(houseRavenclaw);
        hogwarts.add(houseSlytherin);

        return hogwarts;
    }

    public static void main(String [] ss) {
        MapFlatMapTest mapFlatMapTest = new MapFlatMapTest();
        List<List<String>> list = mapFlatMapTest.getList();

        /**
         * Using Stream().Map
         */

        List<String> mapStringList = Arrays.asList("1", "2", "3", "4");
        List<Integer> integerList = mapStringList.stream().map(Integer::valueOf).collect(Collectors.toList());

        System.out.println("String integer values converted into INT >> "+integerList);

        /**
         *  Using Stream().flatMap()
         */
        List<String> flatMapList = list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}
