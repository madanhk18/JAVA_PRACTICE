import java.util.ArrayList;
import java.util.List;

public class d141 {
    public static void main(String[] args) {
        String s="abc";
        String t="ac";
        List<String> list=new ArrayList<>();

        generateAllSubsequences(s,"",0,list);
        if(list.contains(t)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void generateAllSubsequences(String s,String result,int index,List<String> list){
            if(index==s.length()){
                list.add(result);
                return;
            }

        generateAllSubsequences(s,result+s.charAt(index),index+1,list);
        generateAllSubsequences(s,result,index+1,list);

    }
}
