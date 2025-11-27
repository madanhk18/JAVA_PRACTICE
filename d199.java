import java.util.Arrays;

public class d199 {
    public static void main(String[] args) {
        int arr[]={2,6,1,9,4,7,5};
//        int []res=funRIGHTROTATEbyK(arr,2);
        int []Left=funLEFTROTATEbyK(arr,2);
//        System.out.println("Right rotate array by 2 times :"+Arrays.toString(res));
        System.out.println("Left rotate array by 2 times :"+Arrays.toString(Left));

    }
    public static int[] funRIGHTROTATEbyK(int []arr,int k){
        k=k%arr.length;

        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
        rev(arr,0,arr.length-1);
        return arr;
    }
    public static int[] funLEFTROTATEbyK(int []arr,int k){
        k=k%arr.length;

        rev(arr,0,arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);

        return arr;
    }
    public static void rev(int arr[],int st,int end){
        while (st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;

            st++;end--;
        }
    }
}
