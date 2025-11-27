public class d137 {
    public static void main(String[] args) {
        int number=4568;

        int reverse=0;
        while(number>0){
            reverse=reverse * 10 +(number %10);
            number=number/10;
        }
        System.out.println(reverse);
        int lengthh=String.valueOf(number).length();
        System.out.println(lengthh);
    }
}
