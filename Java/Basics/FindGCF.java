public class FindGCF {

    public static int getGcf(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return getGcf(b, a%b);
        }

    }

    public static void main(String[] s) {

        System.out.println(FindGCF.getGcf(12, 80));

    }
}
