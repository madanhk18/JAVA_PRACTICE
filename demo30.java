public class demo30 {
    public static void insetionAtposition(int[] arr,int target){
        int low=0;int high=arr.length-1;
        int index=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                index=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(index);
    }
    public static void main(String[] args) {
        int arr[]={3,7,10,12};
        int target=11;
        insetionAtposition(arr,target);
    }
}
