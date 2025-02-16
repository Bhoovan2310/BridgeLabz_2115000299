public class ConcatenateStringsEfficiently {
    public static void main(String[] args) {
        String[] strings = {"Hello", " ", "World", "!"};
        System.out.println(concatenateStrings(strings));
    }

    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}