public class d193 {
    public static void main(String[] args) {
        String val = "1547451";
        String res = checkPalindrome(val);
        if (val.equals(res)) {
            System.out.println("Palindrome");
        }else
            System.out.println("Not a plindrorme");
    }
    public static String checkPalindrome(String val){
        String ans="";
        for (int j = val.length()-1; j>=0 ; j--) {
            ans=ans+val.charAt(j);
        }
//        System.out.println(ans);
        return ans;
    }

}
