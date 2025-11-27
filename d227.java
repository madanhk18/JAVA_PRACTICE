public class d227 {
    public static void main(String[] args) {
        int arr[]={7,4,8,2,9};
        countValues(arr);
    }
    public static void countValues(int []arr){
        int count=1;
        int maximum=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>maximum)
                count++;

            maximum=Math.max(maximum,arr[i]);
        }
    }
}
