import java.util.Arrays;

public class d92 {
    public static void main(String[] args) {
        int arr[]={10, 5, 20, 8}; //5 8 10 20
//        findSecondLargest(arr);
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
//        System.out.println(largest);
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]<largest){
                return arr[i];
            }
        }
        return -1;
    }
}
