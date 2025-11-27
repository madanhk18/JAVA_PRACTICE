public class d237 {
    public static void main(String[] args) {
        int arr[]={1, 3, 3, 5, 8};
        int target=3;
        fun(arr,target);
    }
    public static void fun(int []arr,int target){
        int ans=0;
        int low=0,high=arr.length-1;

        while (low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]>target){ //upper bound (Strictly greater than)
                high=mid-1;
                ans=mid;
            }
            else
                low=mid+1;
        }
        System.out.println(ans);
    }
}
