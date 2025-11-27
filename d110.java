public class d110 {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=2;
        System.out.println(SearchInsertPosition(arr,target));
    }
    public static int SearchInsertPosition(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
