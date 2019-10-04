import java.util.Scanner;

public class Anagrams {

    //if all the characters are same in 2 string then they are Anagrams
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        } else {
            char [] charA = a.toUpperCase().toCharArray();
            char [] charB = b.toUpperCase().toCharArray();

            java.util.Arrays.sort(charA);
            java.util.Arrays.sort(charB);

            for(int x = 0; x < charA.length; x++) {
                if(charA[x] != charB[x]) {
                    return false;
                }
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
