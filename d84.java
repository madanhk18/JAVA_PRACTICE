public class d84 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 0, 1, 1, 0};
        int n=arr.length;
        int target=4;
        int maxLen=0;
        int starting=-1;


        for (int i = 0; i <n ; i++) {
            int sum=0;
            for (int j = i; j <n ; j++) {
                sum=sum+arr[j];
                if(sum>target)
                    break;
                else{
                    int length=j-i+1;
                        maxLen = Math.max(length, maxLen);
                        starting = i;

                }
            }
        }
        System.out.println("Max length of subarrays ="+maxLen);
        if(starting!=-1){
            System.out.println("Subarrays are:");
            for (int i=starting;i<starting+maxLen;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
