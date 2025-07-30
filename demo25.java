public class demo25 {
    public static int UpperBound(int []arr,int target){
        int index=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                index=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,8,9,9,9,10,11,14,50};
        int target=14;
        System.out.println(UpperBound(arr,target));;
    }
}
