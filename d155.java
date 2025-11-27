public class d155 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        bestTimeUsing2ForLoop(arr);
    }
    public static void bestTimeUsing2ForLoop(int []arr){
        int maxProfit=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            int profit=0;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    profit=arr[j]-arr[i];
                    maxProfit=Math.max(profit,maxProfit);
                }
            }

        }
        System.out.println(maxProfit);
    }
}
