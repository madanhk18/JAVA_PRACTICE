import java.util.*;
public class d234 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String line=sc.nextLine();
//        String ans="";
//        char c1=line.charAt(0);
//        c1=Character.toUpperCase(c1);
//
//        char c2=line.charAt(line.length()-1);
//       c2= Character.toUpperCase(c2);
//         ans=ans+c1;
//         ans+=line.substring(1,line.length()-1);
//         ans+=c2;
//        System.out.println(ans);
        char arr[]={'r','g','r','r','b','a','b','g','f','a'};
        Map<Character,Integer> map=new HashMap<>();

        for(char c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i=0;i<arr.length;i++){
            int ans=map.get(arr[i]);
            if(ans%2!=0){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
