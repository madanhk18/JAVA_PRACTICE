import java.util.ArrayList;

public class demo58 {
    public static void findDuplicate(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        int index;
        for(int n:arr){
            index=Math.abs(n)-1;

            if(arr[index]>0){
                arr[index]=-arr[index];
            }else{
                if(n<0)
                    n=-(n);
                list.add(n);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        findDuplicate(arr);
    }
}
