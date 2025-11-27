public class d145 {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,4,5,5};
        DuplicatArray(arr);
    }
    public static void DuplicatArray(int []arr){
        int []temp=new int[arr.length];
        //temp [] ={2,3,4,5
        //pos=3
        temp[0]=arr[0];
        int pos=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]!=temp[pos]){
                temp[++pos]=arr[i];
            }
        }
        for(int val:temp){
            System.out.print(val);
        }
    }
}
