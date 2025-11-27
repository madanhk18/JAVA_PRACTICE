import java.util.HashMap;

public class d142 {
    public static void main(String[] args) {
        String s="madanhk";
        getMaxSusbtring(s);
    }
    public static void   getMaxSusbtring(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,MaxLen=0;
        while (r<s.length()){
            if(map.containsKey(s.charAt(r))){
               l=Math.max(l,map.get(s.charAt(r))+1);
                map.put(s.charAt(r),l-1);
            }
            map.put(s.charAt(r),r);
            MaxLen=Math.max(MaxLen,r-l+1);
            r++;
        }
        System.out.println(MaxLen);
    }
}
