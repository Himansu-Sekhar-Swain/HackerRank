class FunnyString {
    public static void main(String[] a) {    
        String s = "acxz";
        String value = funnyString(s);
        System.out.println(value);    
    } 
    
    static String funnyString(String s) {
        
        int count = 0;
        int[] actAr =  new int[s.length()];
        int[] revAr =  new int[s.length()];
        
        for(int x = s.length() - 1; x >= 0; x--) {
            actAr[x] = (int) s.charAt(count);
            revAr[x] = (int) s.charAt();
            
            count++;
        }
        
        for(int x = 0; x < actAr.length(); x++) {
            if(Math.abs(actAr[x + 1] - actAr[x]) != Math.abs(revAr[x + 1] - revAr[x])) {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
