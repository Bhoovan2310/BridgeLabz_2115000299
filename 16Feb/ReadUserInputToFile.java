import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInputToFile {
    public static void main(String[] args) {
        String filePath = "output.txt";
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(filePath)) {
            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(input + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}