public class d148 {
    public static void main(String[] args) {
        int n = 27;
        checkPowerOf3(n);
    }

    public static void checkPowerOf3(int n) {
        if (n <= 0)
            System.out.println("False");

        while (n > 1) {
            if (n % 3 != 0)
                System.out.println("False");

            n = n / 3;
        }


    }
}
