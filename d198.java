import java.util.HashMap;

public class d198 {
    public static void main(String[] args) {
        String s="abcdzabahkeu";
        fun(s);
    }
    public static void fun(String s){
        HashMap<Character,Integer> map=new HashMap<>();

        int l=0,r=0,maxLen=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                l=Math.max(l,map.get(c)+1);
            }
            maxLen=Math.max(maxLen,r-l+1);
            map.put(c,r);
            r++;
        }
        System.out.println(maxLen);
    }
}
