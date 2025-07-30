public class demo24 {
    public static int  lowerBound(int []arr,int target,int n){
        int low=0;int high=arr.length-1;
        int ans=n;
        while (low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }

        if(arr[ans]==target){
            return ans;
        }

    return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int target=7;
        int n=arr.length;
        System.out.println(lowerBound(arr,target,n));;
    }
}
