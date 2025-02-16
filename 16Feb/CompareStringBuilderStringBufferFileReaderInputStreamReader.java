import java.io.*;

public class CompareStringBuilderStringBufferFileReaderInputStreamReader {
    public static void main(String[] args) {
        String str = "hello";
        int iterations = 1_000_000;

        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(str);
        }
        long endBuilder = System.nanoTime();

        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append(str);
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder time: " + (endBuilder - startBuilder) + " ns");
        System.out.println("StringBuffer time: " + (endBuffer - startBuffer) + " ns");

        String filePath = "largefile.txt";

        try {
            long startFileReader = System.nanoTime();
            int wordCountFileReader = countWords(new FileReader(filePath));
            long endFileReader = System.nanoTime();

            long startInputStreamReader = System.nanoTime();
            int wordCountInputStreamReader = countWords(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
            long endInputStreamReader = System.nanoTime();

            System.out.println("FileReader word count: " + wordCountFileReader);
            System.out.println("FileReader time: " + (endFileReader - startFileReader) + " ns");
            System.out.println("InputStreamReader word count: " + wordCountInputStreamReader);
            System.out.println("InputStreamReader time: " + (endInputStreamReader - startInputStreamReader) + " ns");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found at path '" + filePath + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countWords(Reader reader) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}