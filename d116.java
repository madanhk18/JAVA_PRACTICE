public class d116 {
    public static void main(String[] args) {
        String name = "madan";
        System.out.println(getSwap(name));
    }

    private static String getSwap(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}