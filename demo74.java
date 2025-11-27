public class demo74 {
    public static void ReturnMaxLenSliding_window(int[] arr,int sum){
        int maxLen=0;
        for (int i = 0; i < arr.length; i++) {
            int s=0;
            for (int j = i; j <arr.length ; j++) {
                s+=arr[j];
                if(s<=sum)
                    maxLen=Math.max(maxLen,j-i+1);
            }
        }
        System.out.println(maxLen);

    }
    public static void main(String[] args) {
        int arr[]={5,3,4,1,7,9}; //5
        int sum=14;
        ReturnMaxLenSliding_window(arr,sum);
    }
}
