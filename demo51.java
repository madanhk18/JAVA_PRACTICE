import java.util.ArrayList;
import java.util.Arrays;

public class demo51 {
    public static  void rearrange(ArrayList<Integer> arr){
        ArrayList<Integer> pos=new ArrayList<>();
        int posSize=0;
        ArrayList<Integer> neg=new ArrayList<>();
        int negSize=0;


        for(int num:arr){
            if(num>=0)
                pos.add(num);
            else
                neg.add(num);
        }

        arr.clear();
        System.out.println(pos.size());
        while(posSize<pos.size() & negSize<neg.size()){
            arr.add(pos.get(posSize++));
            arr.add(neg.get(negSize++));
            }

        while (posSize<pos.size()){
            arr.add(pos.get(posSize++));
        }

        while (negSize<neg.size()){
            arr.add(neg.get(negSize++));
        }

        System.out.println(arr);

//
    }
    public static void main(String[] args) {
        Integer arrr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(arrr));
        rearrange(arr);
    }
}
