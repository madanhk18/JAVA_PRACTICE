import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demo59 {
    public static void fetchAllPalindro(String name){
        HashMap<String,Integer> map=new HashMap<>();
        String final_word="";
        int left=0,right=0;
        for (int i = 0; i < name.length() ; i++) {
            checkForPslindrome(name,i,i,map); //odd length
            checkForPslindrome(name,i,i+1,map);
        }
        int maxLen=0;
        for (Map.Entry<String ,Integer> e:map.entrySet()){
            if(e.getValue()>maxLen){
                maxLen=e.getValue();
                final_word=e.getKey();
            }
        }
        System.out.println(final_word);
    }
    public static void checkForPslindrome(String name,int left,int right,HashMap<String,Integer> map){
        while(left>=0 && right<name.length() && name.charAt(left)==name.charAt(right)){
            String word=name.substring(left,right+1);
            map.put(word,word.length());
            left--;right++;
        }
    }
    public static void main(String[] args) {
        String name="madan";
        fetchAllPalindro(name);
    }
}
