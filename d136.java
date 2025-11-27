public class d136 {

    public static void main(String[] args) {
        int fruots[]={4,2,5}; //4
        int basket[]={3,5,4};
        getReplacedvalue(fruots,basket);
    }
    public static void getReplacedvalue(int[] fruots,int[] basket) {
        int n = fruots.length;
//        System.out.println(n);
        int unplaced = n;
        boolean used[] = new boolean[n];
        for (int singleFruit : fruots) {
            for (int i = 0; i < n; i++) { //
                if (used[i]==false && basket[i] >= singleFruit) {
                    used[i]=true;
                    unplaced--;
                    break;
                }
            }
        }
        System.out.println(unplaced);
    }
}
