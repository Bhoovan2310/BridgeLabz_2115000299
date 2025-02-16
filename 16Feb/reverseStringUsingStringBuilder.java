public class reverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}