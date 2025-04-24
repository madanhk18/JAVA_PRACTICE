import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Madan",1);
        map.put("cha",2);
        map.put("gp",3);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("cha"));
        map.remove("Madan");
        System.out.println(map);
        map.put("gp",4);
        System.out.println(map);

        //iteration usig for loop
//        for (Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println("Key ="+e.getKey() + " "+ "Value ="+e.getValue());
//
//        }

        Set<String> s=map.keySet();
        for (String sk:s){
            System.out.println(sk);
        }
    }
}