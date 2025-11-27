public class demo56 {
    public static boolean CheckPalindrome(String name){
        int low=0;
        int high=name.length()-1;
        while(low<=high){
            if(name.charAt(low)!=name.charAt(high))
                return false;

            low++;high--;
        }

        return true;
    }
    public static void main(String[] args) {
        String name="madam";
        System.out.println(CheckPalindrome(name));
    }
}
