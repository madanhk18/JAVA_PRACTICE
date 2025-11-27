import java.util.*;

public class m12{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        returnDuplicates(arr);

    }
    public static void returnDuplicates(int []arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                System.out.print(e.getKey()+" ");
            }
        }
    }
}