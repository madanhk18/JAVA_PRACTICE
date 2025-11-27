import java.util.HashMap;
import java.util.Map;

public class d192 {
    public static void main(String[] args) {
        String v="Learn Java Programming";
        countDuplicate(v);
    }
    public static void countDuplicate(String v){
        String res=v.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        System.out.println(res);
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:res.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>1)
                System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
