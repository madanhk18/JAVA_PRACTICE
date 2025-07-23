public class demo10 {
    public static void    seondSmallest(int []arr){
        int smallest=arr[0];
        int sSmallest=-1;

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]>sSmallest && arr[i]<smallest) {
                sSmallest=arr[i];
            }
        }
        System.out.println(sSmallest);
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,7,8,9,4,1};
        seondSmallest(arr);
    }
}
