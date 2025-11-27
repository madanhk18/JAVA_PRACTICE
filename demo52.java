public class demo52 {
    public static void main(String[] args) {
        boolean Raining = true;
        boolean AddOdd = true;
        int odd = 1;
        int even = 0;

        for (int i = 0; i < 9; i++) {
            AddOdd = !AddOdd;

            if (!AddOdd) {
                System.out.println("Added even" + i);
            } else {
                System.out.println("Added odd" + i);
            }
        }
    }
}
