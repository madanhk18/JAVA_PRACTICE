public class demo29 {
    public static int lowBound(int[] arr,int target){
        //greater than or equal to the target values
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans==arr.length || arr[ans]!=target){
            ans=-1;
        }
        return ans;
    }
    public static int upbound(int[] arr,int target) {
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans==arr.length){
            ans=-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,7,10,12};
        int target=7;
        System.out.println(lowBound(arr,target)+ " ");
        System.out.println(upbound(arr,target));
    }
}
