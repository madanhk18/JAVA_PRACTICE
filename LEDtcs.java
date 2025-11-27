import java.util.*;

public class LEDtcs {

    static int[] LED = {
            0b1111110, //0
            0b0110000, //1
            0b1101101, //2
            0b1111001, //3
            0b0110011, //4
            0b1011011, //5
            0b1011111, //6
            0b1110000, //same next
            0b1111111,
            0b1111011
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int X = sc.nextInt(); // Hour cost
        int Y = sc.nextInt(); // Minute cost
        int currHour = Integer.parseInt(time.substring(0, 2));
        int currMin = Integer.parseInt(time.substring(3, 5));
        int[] digits_array = {currHour / 10, currHour % 10, currMin / 10, currMin % 10};
        String best_Time = null;
        int minCost_value = Integer.MAX_VALUE;
        for (int pos = 0; pos < 4; pos++) {
            int original_val = digits_array[pos];
            for (int d = 0; d <= 9; d++) {
                if (d == original_val) continue;
                if (bitDiffenece(LED[original_val], LED[d]) == 1) {
                    int[] newDigits = digits_array.clone();
                    newDigits[pos] = d;
                    int new_Hour = newDigits[0] * 10 + newDigits[1];
                    int new_Min = newDigits[2] * 10 + newDigits[3];

                    if (new_Hour >= 1 && new_Hour <= 12 && new_Min >= 0 && new_Min <= 59) {
                        int hourDiffe = Math.min(Math.abs(new_Hour - currHour), 12 - Math.abs(new_Hour - currHour));
                        int minDiff = Math.min(Math.abs(new_Min - currMin), 60 - Math.abs(new_Min - currMin));
                        int cost = X * hourDiffe + Y * minDiff;

                        String candidate = String.format("%02d:%02d", new_Hour, new_Min);
                        if (cost < minCost_value || (cost == minCost_value && candidate.compareTo(best_Time) < 0)) {
                            minCost_value = cost;
                            best_Time = candidate;
                        }
                    }
                }
              }
               }

        if (best_Time != null) System.out.println(best_Time);
        else System.out.println("No closest valid time possible");
    }

    static int bitDiffenece(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}
