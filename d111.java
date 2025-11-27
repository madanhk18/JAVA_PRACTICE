public class d111 {
    public static void main(String[] args) {
        int arr[]={0,2,4,7,1,0};
        System.out.println(findPeakElement(arr));;
    }
    public static int findPeakElement(int []arr){
        for (int i = 0; i < arr.length; i++) {
            if((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i]>arr[i+1])){
                return i;
            }
        }
        return -1;
    }
}
