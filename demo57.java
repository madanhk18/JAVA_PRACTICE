import java.util.List;
import java.util.*;

public class demo57 {
    public static void findDisappearedNumbers(int[] nums) {
       HashSet<Integer> hash=new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
       for (int n:nums){
           hash.add(n);
       }
        for (int i = 1; i <=nums.length ; i++) {
            if(!hash.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        int []nums={4,3,2,7,8,2,3,1};

        findDisappearedNumbers(nums);
    }
}
