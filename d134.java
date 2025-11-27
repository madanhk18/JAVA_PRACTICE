public class d134 {
    public static void main(String[] args) {
        int coins[]={1,5,6,9};
        int amount=11;

        getOutput(coins,amount);
    }
    public static void getOutput(int[] coins,int amount){

        int arr[]=new int[amount+1];

        for (int i = 1; i <arr.length ; i++) {

            arr[i]=Integer.MAX_VALUE;

            for(int SingleCoin:coins){
                if(SingleCoin<=i && arr[SingleCoin-i]!=Integer.MAX_VALUE){
                    arr[i]=Math.min(arr[SingleCoin],1+arr[SingleCoin-i]);
                }
            }
        }
        System.out.println(arr[amount]);
    }
}
