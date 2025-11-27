public class d82 {
    public static void main(String[] args) {
        int arr[]={-1,4,8,2,5,-4};
        int n=arr.length;
//        int k=3;
//        //constant window - to find the maxSum
//        int sum=0;
//        int maxSum=Integer.MIN_VALUE;
//        int l=0;int r=k;
//        for (int i = l; i <r ; i++) {
//            sum+=arr[i];
//        }
//        while(r<arr.length){
//            sum=sum-arr[l++];
//            sum+=arr[r++];
//            maxSum=Math.max(sum,maxSum);
//        }
//        System.out.println(maxSum);
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }

    }
}
