import java.util.*;
public class d223 {
    public static void main(String[] args) {
        /*
        🧠 Case 6 — Odd Element in the Beginning
Input:
7
3 4 4 5 5 6 6

Output:
3


👉 odd element appears right at the start.

🧠 Case 7 — Odd Element in the End
Input:
7
1 1 2 2 3 3 4

Output:
         */
        int arr[]={3, 4, 4, 5, 5, 6, 6};
        findOddOne(arr);
    }
    public static void findOddOne(int []arr){
        Map<Integer,Integer> map=new HashMap<>();

        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(Integer ans:map.values()){
            System.out.println(ans);
        }
//        int low=0,high=arr.length-1;
//
//        while (low<high){
//            int mid=low+(high-low)/2;
//
//            if(mid%2==1)
//                mid--;
//
//            if(arr[mid] == arr[mid+1])
//                low=mid+2;
//
//            else
//                high=mid;
//
////            low++;high--;
//        }
//        System.out.println(arr[low]);
    }
}
