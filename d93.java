import java.util.Arrays;

public class d93 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
    public static void reverse(int[] arr) {
        int l=0;int r=arr.length-1;
        while (l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            l++;r--;
        }
    }
}
