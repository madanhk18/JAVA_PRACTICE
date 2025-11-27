public class d210 {
    public static void main(String[] args) {
        /*“Find the largest of two numbers without using loop and condition.”

         */
        int a=11,b=22;
//        System.out.println(a>b?"a is greater":"b is greater");
        int max=(a+b+Math.abs(a-b))/2;
        System.out.println(max);
    }
}
