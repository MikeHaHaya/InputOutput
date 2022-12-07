import java.io.*;

public class FileIO {

    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file");
            writer.write("\nAnother one");


            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);


            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
