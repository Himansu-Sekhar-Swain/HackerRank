import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllStreams {

    /**
     * Stream is wrapper of resources to help to manage elements in it.
     */
    private void createAStream() {
        String [] elements = new String[] {"Item_01", "Item_02", "Item_03", "Item_04"};
        List<String> list = Arrays.asList(elements);
        System.out.println("Stream Wrapping list of items : "+Stream.of(list));
        Stream<String> streams = Stream.of(elements);
        /**
         * Sample forEach over Stream
         */
        streams.forEach(element -> {
            System.out.println("Element >> "+element);
        });
    }

    /**
     * Stream : Generate Method -> Generated dates at every one second.
     */
    private void streamGenerate() {
        /*Stream<Date> dateStream = Stream.generate(() -> {
            return new Date();
        });

        dateStream.forEach(dt -> {
            System.out.println("Generated Date > "+dt);
        });*/
        System.out.println("Generated Date > Method has been commented out.");
    }

    /**
     * Create empty stream to avoid null
     *
     * @return
     */
    public Stream<String> createEmptyStream() {
        Stream<String> stream = Stream.empty();
        return stream;
    }

    /**
     * Filter and collects
     */
    private void streamCollectEvenOdd() {
        List<Integer> list = new ArrayList<>();
        for(int x = 1; x < 30; x++) {
            list.add(x);
        }
        Stream<Integer> integerStream = list.stream();
        List<Integer> evenList = integerStream.filter(xx -> xx % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Collection : "+evenList);
    }

    /**
     * All other Stream useful methods:
     *
     */
    private void streamUtils() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");       
        
        Collections.sort(memberNames);
        /**
         * Filter name begin with 'A'
         */
        memberNames.stream().filter(name -> name.startsWith("A")).forEach(name -> {
            System.out.println("Names starting with 'A' >"+ name);
        });

        /**
         * Map the filtered names into Capital letter
         */
        memberNames.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).forEach(nameCpas -> {
           System.out.println("Names are mapped to capital letter > "+nameCpas);
        });

        /**
         * Sorting
         */
        memberNames.stream().sorted().forEach(name -> {
            System.out.println(name);
        });
        /**
         * Matching
         */
        boolean anyMatch = memberNames.stream().anyMatch((name)->name.startsWith("A"));
        System.out.println("Stream : Match Function :: Are there any name matched with 'A' > "+anyMatch);

        /**
         * Stream : Count Function
         */
        long count = memberNames.stream().count();
        System.out.println("Stream : Count Function > Total Elements in Collection : "+count);
        long filteredCount = memberNames.stream().filter(name -> name.startsWith("A")).count();
        System.out.println("Stream : Count Function > Total Elements starts with 'A' in Collection : "+count);

        /**
         * Stream : FirstFind [Get the first element and stops processing]
         */
        String nameL = memberNames.stream().filter(name -> name.startsWith("L")).findFirst().get();
        System.out.print("Stream > FirstFind ::: First name in the collection strats with 'L' is >>> "+nameL);
    }

    /**
     * Main method.
     *
     * @param s
     */
    public static void main(String[] s) {
        AllStreams allStreams = new AllStreams();
        allStreams.createAStream();
        allStreams.streamGenerate();
        allStreams.streamCollectEvenOdd();
        allStreams.streamUtils();
    }
}
