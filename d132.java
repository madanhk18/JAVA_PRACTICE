public class d132 {
    public static void main(String[] args) {
        int n = 6;

        int [] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

//        System.out.println(dp.length);

        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
//    }
    }
}
