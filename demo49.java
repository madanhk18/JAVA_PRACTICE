public class demo49 {
    public static void subArray(int[] arr){
        int sum=0;
        int MaxSum=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = i; j <arr.length ; j++) {
                    sum+=arr[j];
                    MaxSum=Math.max(sum,MaxSum);
                }
                System.out.println(MaxSum);
            }

    }
    public static void main(String[] args) {
        int arr[] = {-3,-2,4,-1,-2,1,5,-3};
        subArray(arr);
    }
}
