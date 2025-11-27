import java.util.*;
public class d219 {
    public static void main(String[] args) {
        int arr[]={10,16,88,2,7};//10,16  16,88 88,2  2,7
        int range=2;
        findMaxAtEachRange(arr,range);
    }
    public static void findMaxAtEachRange(int []arr,int r){
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i <=arr.length-r ; i++) {
            int max=arr[i];
            for (int j = i; j <i+r ; j++) {
//                System.out.println(arr[j]);
                if(arr[j]>max)
                    max=arr[j];
            }
            list.add(max);
            System.out.println();
        }
        System.out.println(list);
    }
}
