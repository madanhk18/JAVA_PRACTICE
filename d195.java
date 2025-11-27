import java.util.*;

public class d195 {
    public static void main(String[] args) {
        int arr[]={4,3,7,9,3,2,1,6,4};
        duplicates(arr);
    }
    public static void duplicates(int []arr){
        List<Integer> list=new ArrayList<>();
//
//        for (int val:arr){
//            int index=Math.abs(val)-1;
//
//            if(arr[index]>0)
//                arr[index]=-arr[index];
//            else
//                list.add(Math.abs(val));
//        }
//        System.out.println(list);
        HashSet<Integer> set=new HashSet<>();

//        System.out.println(set.add(5));
        for (int i = 0; i < arr.length ; i++) {
            if(set.add(arr[i])==false){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
