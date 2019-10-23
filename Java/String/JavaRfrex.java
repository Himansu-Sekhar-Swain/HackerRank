import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

/**
* below code has taken from https://github.com/RodneyShag/HackerRank_solutions/ with permission
*/
class MyRegex {
    String ipnum = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = ipnum + "." +  ipnum + "." +  ipnum + "." + ipnum;
}
