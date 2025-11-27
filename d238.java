public class d238 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,11,13};
        int tar=8;
        findStarting(arr,tar);
    }
    public static void findStarting(int []arr,int target){
        int start=-1,end=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (start == -1) {
                    start = i;
                    end = i;
                }
                end = i;
            }
        }
        System.out.println(start+" "+end);
    }
}
