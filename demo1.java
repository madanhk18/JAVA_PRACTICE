import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void CallingSubsequence(int []arr,int index,ArrayList<Integer> ls){
        if(index==arr.length){

                System.out.println(ls);

            return;
        }
        ls.add(arr[index]);
        CallingSubsequence(arr,index+1,ls);

        ls.remove(ls.size()-1);
        CallingSubsequence(arr,index+1,ls);
    }
    public static void main(String[] args) {
       int arr[]={4,3,6,1};
       int index;
       ArrayList<Integer> ls=new ArrayList<>();
       CallingSubsequence(arr,0,ls);
    }
}
