public class d241 {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        fetchTimesArrayRotated(arr);
    }
    public static void fetchTimesArrayRotated(int []arr){
        int ans=Integer.MAX_VALUE;
        int idx=0;
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;

            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    ans=arr[low];
                    idx=low;
                }
                break;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<=ans){
                    ans=arr[low];
                    idx=low;
                }
                low=mid+1;
            }else{
                if(arr[mid]<=ans){
                    ans=arr[mid];
                    idx=mid;
                }
                high=mid-1;
            }
        }
        System.out.println(ans);
        System.out.println(idx+" times array has been rotated");
    }
}
