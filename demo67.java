import java.util.ArrayList;
import java.util.List;

public class demo67 {
    public static void findCharacter(String[] words,char x){
        List<Integer> list=new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            if(words[i].contains(String.valueOf(x)))
//                list.add(i);
//        }

//        System.out.println(list);
        System.out.println(words[1].indexOf(x));
    }
    public static void main(String[] args) {
        char x = 'e';
        String words[]={"leet","code"};
        findCharacter(words,x);
    }
}
