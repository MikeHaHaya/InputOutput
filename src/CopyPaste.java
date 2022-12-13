import java.io.*;

public class CopyPaste {

    public static void main(String[] args) {

        File sourcePath = new File("C:\\Users\\danie\\Downloads\\Profile.pdf");
        File destPath = new File("C:\\Users\\danie\\OneDrive\\Desktop\\Profile.pdf");

        try {
            copyFileUsingStream(sourcePath, destPath);
        } catch (IOException e) {}

    }

    private static void copyFileUsingStream(File sourcePath, File destPath) throws IOException {

        InputStream input = null;
        OutputStream output = null;

        try {
            input = new FileInputStream(sourcePath);
            output = new FileOutputStream(destPath);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }

        } finally {
            input.close();
            output.close();
        }

    }


}
