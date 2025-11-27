import java.util.Map;
import java.util.TreeMap;

public class d96 {
    public static void main(String[] args) {
        String m = "programming";
        OrdderOfAlpha(m);
    }

    public static void OrdderOfAlpha(String m) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (char c : m.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey() + " => "+ e.getValue());
        }

    }

}