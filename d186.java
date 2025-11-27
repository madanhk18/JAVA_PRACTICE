public class d186 {
    public static void main(String[] args) {
        String s1="anagramm";
        String s2="marganaa";
        checkAnagram(s1,s2);
    }
    public static void checkAnagram(String a,String b){
        int arr[]=new int[26];
        if(a.length()!=b.length())
            System.out.println("No anagrams");
        else {
            for (int i = 0; i < a.length(); i++) {
                arr[a.toLowerCase().charAt(i)-'a']++;
            }
            for (int i = 0; i < b.length(); i++) {
                arr[b.toLowerCase().charAt(i)-'a']--;
            }
            for(int v:arr) {
                if (v > 0 || v < 0) {
                    System.out.println("Not Anagrams");
                    break;
                }
            }
            System.out.println("Anagrams");
        }
    }
}
