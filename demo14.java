
import java.util.*;

public class demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Equation:");
        String eqn = sc.nextLine();
        convertionLexical(eqn);
    }

    public static void convertionLexical(String eqn) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < eqn.length()) {
            char ch = eqn.charAt(i);

            if (ch == '=' || ch == '+' || ch == '-' || ch == '*') {
                sb.append(String.format(" <%c> ,", ch));
                i++;
            } else if (Character.isLetter(ch)) {

                String ss = "id" + count;
                sb.append(String.format(" <%s, %c> ,", ss, ch));
                count++;
                i++;
            } else if (Character.isDigit(ch)) {

                StringBuilder number = new StringBuilder();
                while (i < eqn.length() && Character.isDigit(eqn.charAt(i))) {
                    number.append(eqn.charAt(i));
                    i++;
                }
                sb.append(String.format(" <num, %s> ,", number.toString()));
            } else {
                // Ignore whitespace or other characters
                i++;
            }
        }

        // Remove the last comma if present
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.setLength(sb.length() - 1);
        }

        System.out.println(sb.toString().trim());
    }
}