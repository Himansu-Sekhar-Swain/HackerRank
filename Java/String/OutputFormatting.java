import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String newInt = "";
                String s1 = sc.next();
                
                int x=sc.nextInt();
                String intVal = x+"";
                if(intVal.length() <= 3) {
                    if(intVal.length() == 1) {
                        newInt = "00"+intVal;
                    } else if(intVal.length() == 2) {
                        newInt = "0"+intVal;
                    } else {
                        newInt = intVal;
                    }
                }
                System.out.printf("%-15s%03d%n", s1, Integer.parseInt(newInt));
                //System.out.printf("%-20s %-30s\n", s1,newInt);
            }
            System.out.println("================================");

    }
}



