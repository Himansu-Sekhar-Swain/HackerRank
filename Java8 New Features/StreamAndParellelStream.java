
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAndParellelStream {

    public static void main(String dd[]) {
        List<Integer> list = new ArrayList<>();
        for (int x = 0; x < 29; x++) {
            list.add(x);
        }

        list.stream().forEach(integer -> System.out.println("Stream >>> "+integer));
        Stream pStream= list.parallelStream();
        pStream.forEach(o -> System.out.println("P_Stream >>> "+o));
    }
}
