import java.util.ArrayList;
import java.util.List;

public class d225 {
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        FindMaxNuminWindow(arr,k);
    }
    public static void FindMaxNuminWindow(int []arr,int k){
        List<Integer> list=new ArrayList<>();
        int maximum=Integer.MIN_VALUE;

        int i=0,j=0;
        while (j<arr.length){
            if((j-i+1)<k){
                maximum=Math.max(maximum,arr[j++]);
            }
            if((j-i+1)==k){
                maximum=Math.max(maximum,arr[j]);
                list.add(maximum);
                i++;j++;
            }
        }
        System.out.println(list);
    }
}
