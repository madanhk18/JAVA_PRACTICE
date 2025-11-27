public class d143 {
    public static void main(String[] args) {
        int arr[]={2,6,0,1,0,0,23};
        moveZeros(arr);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
    public static void moveZeros(int []arr){
        int positionNumber=0;
        for (int r = 0; r < arr.length; r++) {
            if(arr[r]!=0){
            arr[positionNumber]=arr[r];
            positionNumber++;
            }
        }
        for (int i = positionNumber; i <arr.length ; i++) {
            arr[i]=0;
        }

    }
}
