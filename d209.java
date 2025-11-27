public class d209 {
    public static void main(String[] args) {
        /*7. Swapping Two Numbers Without Third Variable

🧩 Problem Statement:

Given two numbers a and b, swap their values without using a temporary variable.

Example:

Input:  a = 5, b = 10
Output: a = 10, b = 5

         */
        int a=5,b=15;
        swap(a,b);
    }
    public static void swap(int a,int b){
//        a=a+b;
//        b=a-b;
//        a=a-b;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
