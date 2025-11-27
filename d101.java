import java.util.HashMap;

public class d101 {
    public static void main(String[] args) {
        HashMap<Integer,Character> map=new HashMap<>();
        map.put(1,'A');
        map.put(2,'B');
        map.put(3,'C');
//        System.out.println(map);
        map.put(3,'I');
        System.out.println(map);
    }
}
