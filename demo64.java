import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo64 {
    public static void main(String[] args) {
//        1,1,2,3,4
        int nums[] = {1, 1, 2, 3, 4};
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int index=0;
        Iterator<Integer> it= set.iterator();
        while (it.hasNext()){
            int ele=it.next();
            nums[index++]=ele;
            it.remove();
        }
        for (int n:nums){
            System.out.println(n);
        }
    }
}
