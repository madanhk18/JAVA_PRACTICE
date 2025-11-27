package SlidingWindow;

public class _01SW {
    public static void main(String[] args) {
        int arr[]={4,9,2,1,8,3,6,5};
        int windSize=3;
        func(arr,windSize);
    }
    public static void func(int []arr,int windSize){
        int maxSum,sum=0,i;
        for (i = 0; i <windSize ; i++) {
            sum+=arr[i];
        }
        maxSum=sum;
        while (i<arr.length){
            sum+=arr[i] - arr[i-windSize];
            maxSum=Math.max(maxSum,sum);
            i++;
        }
        System.out.println(maxSum);
    }
}
