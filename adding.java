public class adding {
    public static int addingBoth(int num1,int num2){
        while(num2>0){
            num1++;
            num2--;
        }
        while(num2<0){
            num1--;
            num2++;
        }
        return num1;
    }
    public static void main(String[] args) {
        int num1=6;
        int num2=4;
        System.out.println(addingBoth(num1,num2));;
    }
}
