import java.util.*;

public class d224 {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String pat="abc";

        countAnagrams(s,pat);
    }
    public static void countAnagrams(String s,String pat){

        int patter[]=new int[26];
        int com[]=new int[26];

        List<Integer> list=new ArrayList<>();

        for(char c:pat.toCharArray()){
            patter[c-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            com[s.charAt(i)-'a']++;

            if(i>=pat.length()){
                com[s.charAt(i - pat.length())-'a']--;
            }

            if(Arrays.equals(com,patter)){
                list.add(i-pat.length()+1);
            }
        }

        System.out.println(list);
    }
}
