public class d206 {
    public static void main(String[] args) {
        /*2. Binary to Decimal

Problem Statement:

Given a binary number in the form of a string, like "01010011", convert it to its decimal equivalent. You cannot use built-in parsing functions like Integer.parseInt(str, 2).

Example:

Input: "1011"
Output: 11

         */
        String s = "01010011";
        binToDec(s);
    }

    public static void binToDec(String s) {
        int sum = 0;
        int len = s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((int) c == 49) {
                sum = sum + (int) Math.pow(2, len);
                len--;
            } else {
                len--;
            }
        }

        System.out.println(sum);
    }
}

