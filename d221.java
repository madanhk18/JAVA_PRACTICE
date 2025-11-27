import java.util.*;

public class d221 {
    public static void main(String[] args) {
        int arr[]={12, 1, 7, 8, 15, 30, 16, 28};
//        int arr[]={-5, 2, -5, 3, -5};
        int k=3;
        FirstNegative(arr,k);
    }
    public static void FirstNegative(int []arr,int k){
        List<Integer> list=new ArrayList<>();

        int i=0,j=0;
        while (j<arr.length){
            if((j-i+1)<k){
                if(arr[j]<0)
                    list.add(arr[j]);
                j++;
            }
            else if((j-i+1)==k){
                if(arr[j]<0) list.add(arr[j]);

                if(list.isEmpty())
                    System.out.print(0+" ");
                else System.out.print(list.get(0)+" ");

                if(!list.isEmpty() && arr[i]==list.get(0))
                    list.remove(0);

                i++;j++;
            }

        }
    }

}
