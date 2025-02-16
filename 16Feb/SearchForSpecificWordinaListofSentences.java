public class SearchForSpecificWordinaListofSentences {

    public static String searchWord(String[] sentences, String word) {
        
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {"hello world", "world is beautiful", "hello beautiful world"};
        String word = "hello";
        System.out.println(searchWord(sentences, word));
    }
}