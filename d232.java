import java.util.*;
public class d232 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3};

        ins(arr,4,8);
    }
    public static void ins(int []arr,int position,int val){
//        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        for(int v:arr){
            set.add(v);
        }
//        list.addFirst(6);
//        list.addLast(7);
//        list.add(4,8);
//        System.out.println(list);
        System.out.println(set.size());


    }
}
