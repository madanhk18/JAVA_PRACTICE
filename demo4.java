import java.util.HashMap;
import java.util.Map;

public class demo4 {
    public static String FreqCheck(String name) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for (char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            sb.append(e.getKey());
            sb.append(e.getValue());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String name="aaaabbbcce";
        System.out.println( FreqCheck(name));
    }
}
