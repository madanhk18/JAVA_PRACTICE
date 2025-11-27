import java.util.*;

public class d197 {
    public static void main(String[] args) {
        List<String> Strings=new ArrayList<>();
        List<String> query=new ArrayList<>();

        Strings.add("ab");
        Strings.add("ab");
        Strings.add("abc");

        query.add("ab");
        query.add("abc");
        query.add("bc");

        List<Integer> in=checkForOccurences(Strings,query);
        System.out.println(in);

    }
    public static List<Integer> checkForOccurences(List<String> St,List<String> qu){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<qu.size();i++){
            int c=0;
            for (int j = 0; j <St.size() ; j++) {
                if(qu.get(i).equals(St.get(j)))
                    c++;
            }
            list.add(c);
        }
        return list;
    }
}
