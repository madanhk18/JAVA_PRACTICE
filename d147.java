interface Additioninterface {
    public int add(int a,int b);
}
class addTwoNums implements Additioninterface {
    public int add(int a, int b) {
        return a + b;
    }
}

    public class d147 {
        public static void main(String[] args) {
            Additioninterface add=(int a,int b) -> a + b;
            System.out.println( add.add(1,2));
        }
    }

