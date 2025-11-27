import java.util.HashSet;
import java.util.Set;

public class demo60 {
    public static boolean findDifference(int[] nums,int x){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(Math.abs(nums[j]-nums[i])==x)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums={5, 20, 3, 2, 5, 80};
        int x=78;
        System.out.println(findDifference(nums,x));;
    }
}
