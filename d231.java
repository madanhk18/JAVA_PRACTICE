import java.util.Arrays;

public class d231 {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
       int ans= giveMediam(arr);
        System.out.println(ans);
    }
    public static int giveMediam(int []arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (arr.length % 2 == 0) {
            int inx=n/2;
            return (arr[inx]+arr[inx-1])/2;
        } else {
            return arr[n/2];
        }
    }
}
