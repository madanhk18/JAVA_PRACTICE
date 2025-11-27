public class d170 {
    public static void main(String[] args) {
        /*
        Problem: Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
         */
        String s[] = {"h","e","l","l","o"};
       String []res= printRev(s);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }

    }
    public static String[] printRev(String [] s){
        int l=0,r=s.length-1;
        while (l<=r){
            String temp=s[l];
            s[l]=s[r];
            s[r]=temp;

            l++;r--;
        }
        return s;
    }
}
