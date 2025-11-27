public class d240 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        minimumRotated(arr);
    }
    public static void minimumRotated(int []arr){
        int low=0,high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while (low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]<ans)
                ans=Math.min(ans,arr[mid]);

            if(arr[low]<=arr[mid]){ //sorted
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
