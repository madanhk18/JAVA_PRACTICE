public class demo8 {
    public static int findingPeek(int []arr){
         // 1,3,6,4,2,0
        //  i =0  [3>1] -> pV=3
        //i=1 [6>3] -> pV=6
         //
        if(arr.length==0) return -1;

        int peekValue=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]>arr[i]){
                peekValue=arr[i+1];
            }
        }
        return peekValue;
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,4,2,0};
        System.out.println( findingPeek(arr));
    }
}
