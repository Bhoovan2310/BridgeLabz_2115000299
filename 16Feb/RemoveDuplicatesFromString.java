import java.util.HashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}