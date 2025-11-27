import java.util.Arrays;

public class d103 {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
//        System.out.println(removeDuplicates(arr));
        d103 obj=new d103();
//        System.out.println(obj.removeDuplicates(arr));
        int res=obj.removeDuplicates(arr);
        for (int i = res; i <arr.length ; i++) {
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));


    }
    public  int removeDuplicates(int[] nums){
        // 1,2,3,2,3,3,3
        //    i        j
        // 1,2
        int n=nums.length;
        //two pointer slow and fast approach
        int i=0;
        for (int j = 1; j <n ; j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

}
