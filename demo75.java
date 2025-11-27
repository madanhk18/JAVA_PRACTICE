import java.math.BigInteger;
import java.util.ArrayList;

public class demo75 {
    public static void MinimumSubarray(int num){
//        int minLen=Integer.MAX_VALUE;
//        int sum=0;int l=0;
//        for (int r = 0; r < arr.length; r++) {
//            sum += arr[r];
//
//            while (sum >= target) {
//                minLen = Math.min(minLen, r - l + 1);
//                sum -= arr[l];
//                l++;
//            }
//        }
//        System.out.println(minLen);
        ArrayList<Integer> ls=new ArrayList<>();
        BigInteger ans=BigInteger.ONE;
        for (int i = 2; i <=num ; i++) {
            ans=ans.multiply(BigInteger.valueOf(i));
        }
//        System.out.println(ans);
        String n= ans.toString();
        System.out.println(n.length());
        for (int i = 0; i < n.length(); i++) {
            ls.add(n.charAt(i)-'0');
        }
        System.out.println(ls);

    }
    public static void main(String[] args) {
        int num=5;
        MinimumSubarray(num);
    }
}
