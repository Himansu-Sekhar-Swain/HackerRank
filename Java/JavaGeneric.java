
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

class Printer {
   //Write your code here
   static void printArray(Object[] arr) {
       List<Object> list = Arrays.asList(arr);
       for(Object o : list) {
           try {
               int x = Integer.parseInt(o.toString());
               System.out.println(o);
           }catch(Exception e) {
               System.out.println(o);
           }
       }
   }
 
}

public class JavaGeneric {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
