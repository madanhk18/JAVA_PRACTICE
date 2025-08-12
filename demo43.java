public class demo43 {
    public static void CheckifSorted(int[] arr){
        //base cond

        int n= arr.length;
        int culprit=0;
        for (int i = 1; i < arr.length ; ) {
            if(arr[i]>=arr[i-1]){
                i++;
            }else{
                culprit++;
                i++;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
//        CheckifSorted(arr);
        int another[]=arr.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.println(another[i]);
        }
    }
}
