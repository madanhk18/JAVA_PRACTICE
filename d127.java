import java.util.HashMap;

public class d127 {
    public static void main(String[] args) {
        String s="A D O B E C O D E B A N C";
        //        l
        //        r
        //mapForT(A B C)
        // map(A ->1)
        //unique -> weGot->1
        String t="ABC";
        returnMinimumWindow(s,t);
    }
    public static void returnMinimumWindow(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> mapForT=new HashMap<>();
        int left=0,right=0;
       int MaxLen=0;
       for(char c:t.toCharArray()){
           mapForT.put(c,mapForT.getOrDefault(c,0)+1);
       }
       /*
        String s="A D O B E C O D E B A N C";
        //        l
        //                    r
        //mapForT(A B C)
        // map(A ->1 , D->1 , O ->1 ,B ->1 ,E->1 ,C ->1 , )
        //unique (3) & weGot->2
        String t="ABC";
        */
       int unique=mapForT.size();
       int weGot=0;
       while(right<s.length()) {
            char c=s.charAt(right);
            if(mapForT.containsKey(c)){
                weGot++;
                map.put(s.charAt(c),map.getOrDefault(s.charAt(right),0)+1);
            }
        }
    }
}
