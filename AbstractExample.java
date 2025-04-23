import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class AbstractExample {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(5);
        ls.add(9);
        ls.add(1);
        ls.add(22);
        ls.add(3);

        Collections.sort(ls);
//        System.out.println(ls);
//        for (int i = 0; i < ls.size(); i++) {
//            System.out.println(ls.get(i));
//        }

        ls.forEach(u -> System.out.println(u));
}
}
