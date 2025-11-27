public class d125 {
    public static void main(String[] args) {
        String val="abc";
        System.out.println( printAllSubs(val));
    }
    public static int printAllSubs(String val){
        int n=val.length();
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <=n ; j++) {
                String value=val.substring(i,j);
               if(checkIfPalindrome(value))
                   count++;
            }
        }
        return count;
    }
    public static boolean checkIfPalindrome(String value){
        if(value.length()==1)
            return true;

        int l=0;int r=value.length()-1;
        while (l<=r){
            if(value.charAt(l)!=value.charAt(r))
                return false;

            l++;r--;
        }
        return true;

    }
}
