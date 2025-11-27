public class d239 {
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        int target=5;
        int result=searchInRotatedArr(arr,target);
        System.out.println(result);
    }
    public static int searchInRotatedArr(int []arr,int target){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target)
                return mid;

            //leftSorted
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            //rightSorted
            else{
                if(arr[mid]<=target && target<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
