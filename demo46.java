public class demo46 {
    public static void main(String[] args) {
        int arr[] = {0,2,1,5,3,4};
        int val=0;
        int newArray[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            val=arr[arr[i]];
            newArray[i]=val;
        }

        for (int n:newArray){
            System.out.print(n+" ");
        }
    }
}
