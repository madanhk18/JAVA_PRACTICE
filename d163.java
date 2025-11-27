public class d163 {
    public static void main(String[] args) {
        /*String Problem: Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
*/
        String s = "rat";
        String t = "car";
        checkAnagram(s,t);

    }
    public static void checkAnagram(String s,String t){
        int arr[]=new int[26];
        for (char ch:s.toCharArray()){
            arr[ch - 'a']++;
        }
        for (char ch:t.toCharArray()) {
            if (arr[ch - 'a'] <= 0) {
                System.out.println("false");
                break;
            }
            else {
                System.out.println("true");
                break;
            }
        }

    }
}
