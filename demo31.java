public class demo31 {
    public static void floorANDceil(int[] arr,int target){
        //floor
        int low=0;int high=arr.length-1;
        int floor=arr.length;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                floor=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(floor);

        //ceil
        int lower=0;int higher=arr.length-1;
        int ceil=arr.length;
        while (lower<=higher){
            int middle=(lower+higher)/2;
            if(arr[middle]>=target){
                ceil=arr[middle];
              higher=middle-1;
            }else{
                lower=middle+1;
            }
        }
        System.out.println(ceil);
    }
    public static void main(String[] args) {
        int arr[]={3,7,10,12};
        int target=10;
        floorANDceil(arr,target);
    }
}
