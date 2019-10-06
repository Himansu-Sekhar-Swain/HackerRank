import java.util.*;
import java.io.*;

class LoopsII {
    public int getNext(int x, int b) {
        int num = 1;
        if(x == 0) {
            num = 1;
        } else {
            for (int i = 0; i < x; i++) {
                num = 2 * num;
            }
        }
        return num;
    }
    public static void main(String []argh){
        Solution sol = new Solution();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int seriesVal = a;
            for(int x = 0; x<n; x++) {
                int series = sol.getNext(x, b);
                seriesVal = seriesVal + series * b;
                System.out.print(seriesVal +" ");                
            }
            System.out.println("");
        }
        in.close();
    }
}

