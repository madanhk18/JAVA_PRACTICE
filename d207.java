public class d207 {
    public static void main(String[] args) {
        /*3. Reverse the String

🧩 Problem Statement:

Write a program to reverse a given string s without using any built-in reverse functions.

Example:

Input:  "Brother"
Output: "rehtorB"

         */
        String s="mother";
        revString(s);
    }
    public static void revString(String s){
        String ans="";
        for (int i = s.length()-1; i >=0 ; i--) {
            ans+=s.charAt(i);
        }
        System.out.println(ans);
    }
}
