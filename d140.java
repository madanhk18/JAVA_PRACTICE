import java.util.ArrayList;
import java.util.List;

public class d140 {
    public static void findSubsequences(String str, int index, String current, List<String> result) {
        if (index == str.length()) {
            result.add(current); // Add each subsequence
            return;
        }

        // Include current character
        findSubsequences(str, index + 1, current + str.charAt(index), result);

        // Exclude current character
        findSubsequences(str, index + 1, current, result);
    }
    public static void main(String[] args) {
        String s="abc";
        List<String> list=new ArrayList<>();
        findSubsequences(s,0,"",list);

        for(String stng:list){
            System.out.println(stng);
        }
    }
}
