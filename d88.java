public class d88 {
    public static void main(String[] args) {
        int arr[]={10, 5, 8, 20, 2};
        System.out.println( returnMaxEle(arr));
    }
    public static int returnMaxEle(int[] arr){
        int maxEle=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxEle)
                maxEle=arr[i];
        }
        return maxEle;
    }
}
