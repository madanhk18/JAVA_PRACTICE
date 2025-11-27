public class demo73 {
    public static void Sliding_window(int[] arr,int window_size){
        int left=0,right=window_size; //3
        int sum=0;
        int MaxSum=Integer.MIN_VALUE;
        for (int i = left; i <right ; i++) {
            sum+=arr[i];
        }
        while (right<arr.length){
            sum=sum-arr[left++];
            sum+=arr[right++];//4
            MaxSum=Math.max(sum,MaxSum);
        }
        System.out.println(MaxSum);
    }
    public static void main(String[] args) {
        int window_size=3;
        int arr[]={5,3,8,1,9}; //5
        Sliding_window(arr,window_size);
    }
}
