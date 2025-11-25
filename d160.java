import java.util.HashMap;
import java.util.Map;

public class d160 {
    public static void main(String[] args) {
        String s="aabcb";
        sumOfBeauty(s);
    }
    public static void sumOfBeauty(String s){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                sum+=function(s.substring(i,j),sum);
            }
        }
        System.out.println(sum);
    }
    public static int function(String ss,int sum){
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch:ss.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int high=Integer.MIN_VALUE,low=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            high=Math.max(high,e.getValue());
            low=Math.min(low,e.getValue());
        }
         return high-low;
    }
}
