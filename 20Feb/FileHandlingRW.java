import java.io.*;

public class FileHandlingRW {
    public static void main(String[] args) {
        String source = "source.txt";
        String destination = "destination.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
        }
    }
}
