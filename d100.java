import java.util.HashMap;

public class d100 {
    public static void main(String[] args) {
        String s="abba";
        LongestWithout(s);
    }
    public static void LongestWithout(String s){
        int l=0;int r=0,maxLen=0;
        int length=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        while (r<n) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(map.get(s.charAt(r)) + 1,l);
                length=r-l+1;
                if(length>maxLen)
                    maxLen=length;

                map.put(s.charAt(r),r);
                r++;
            } else {
                map.put(s.charAt(r), r);
                length = r - l + 1;
                if (length > maxLen)
                    maxLen = length;

                r++;
            }
        }
        System.out.println(maxLen);
    }
}
