public class d194 {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        swap(a,b);
        System.out.println("main fun"+a+" "+b);
    }
    public static void swap(int a,int b){
        a=a+b; //25
        b=a-b; //10
        a=a-b; //15

        System.out.println("Inside fun"+a+" "+b);
    }
}
