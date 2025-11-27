public class b3 {
    public static void main(String[] args) {
        /*
        Given an integer n, toggle all even-indexed bits in its binary representation.

👉 Here, indexing is 0-based from the right side:

bit positions →  ... 4 3 2 1 0


Even positions: 0, 2, 4, 6...
         */
        int n=13;
        evenBitToggle(n);
    }
    public static void evenBitToggle(int n){
        String str=Integer.toBinaryString(n);
        int ans=n;
        for (int i = 0; i <str.length() ; i=i+2) {
                ans=(ans ^ (1<<i));
        }
        System.out.println(ans);
    }
}
