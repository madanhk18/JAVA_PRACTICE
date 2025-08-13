import java.util.*;

public class demo44 {
    public static void   rearrangevalues(int[] arr){
        ArrayList<Integer> oddList=new ArrayList<>();
        ArrayList<Integer> evenList=new ArrayList<>();

        for(int val:arr){
            if(val>0)
                evenList.add(val);
            else
                oddList.add(val);
        }
        for(int i=0;i<arr.length;i++) {
            if (i % 2 == 0) {
                arr[i] = evenList.getFirst();
                evenList.removeFirst();
            }
            else {
                arr[i] = oddList.getFirst();
                oddList.removeFirst();
            }
        }

        for (int v:arr){
            System.out.print(v+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        rearrangevalues(arr);
    }
}
