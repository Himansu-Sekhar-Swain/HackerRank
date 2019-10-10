public class AddSpaceInString {
    public static void main(String[] aa) {
        int n = 6;        
        for(int i=0 ; i<n ;i++){  //for i == 0
            for(int j = 0; j <= n-i-2; j++){  //this will run for 6-0-2 = 4 and will add " " from 0th position
                System.out.print(" ");
            }
            for(int j = n-i-1 ; j< n; j++){ //this will for one time (5-6) times but will start from n-0-1 = 5th position
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
