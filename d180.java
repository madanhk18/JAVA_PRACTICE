import java.util.Arrays;

public class d180 {
    public static void main(String[] args) {
        int n=222;
        int res[]=findNoZero(n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findNoZero(int n) {
        if (n % 10 == 1) {
//            int a=2;
//            int b=n-a;
            return new int[]{2,(n-2)};
        }else
            return new int[]{1,(n-1)};
    }
}
