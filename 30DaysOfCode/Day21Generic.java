import java.util.*;

class Printer <T> {

    /**
    * Best way of handling Generic Arrays is convert it to Collection Objects.
    * All Collection Objects will manipulate items using 'AutoBoxing' mechanism.
    * 
    **/
    
    public void printArray(Object[] arr) {
        List<Object> list = Arrays.asList(arr); 
        for(Object o : list) {
            System.out.println(o); //Auto Boxing [No Need to Handle Any Object Type Here]
        }
    }
    
    /**
    * Another way. I am doubt over above method (Do not know why I wrote like that)
    *
    */
    
    public void printArray(Object[] arr) {
        for(int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}

public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}
