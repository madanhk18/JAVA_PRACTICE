import java.util.HashSet;
import java.util.Set;

public class demo76 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        int n=100;

        int low=1;int high=n;
        while(low<=high) {
            int mid = (low + high) / 2;
            if ((mid * mid) > n)
                high = mid - 1;
            else if ((mid * mid) == n){
                System.out.println(1);
            break;
        }
            else
                low=mid+1;
        }
        System.out.println(0);
    }
}
