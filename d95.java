import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class d95 {
    public static void main(String[] args) {
        String s = "igg";
        System.out.println(firstNonRepeatingChar(s));
    }

    public static char firstNonRepeatingChar(String s){
    HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c:s.toCharArray()){
            if(map.get(c)==1)
                return c;
        }
        return '_';
    }
}
