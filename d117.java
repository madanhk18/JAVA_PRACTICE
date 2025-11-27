public class d117 {
    public static void main(String[] args) {
        String input = "level";
        System.out.println( checkForPalindrome(input));
    }
    public static boolean checkForPalindrome(String input){
        int l=0,r=input.length()-1;
        while (l<=r) {
            if (input.charAt(l) != input.charAt(r)) {
                return false;
            }
            l++;r--;
        }
        return true;
    }
}
