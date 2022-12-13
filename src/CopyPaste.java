import java.io.*;

public class CopyPaste {

    public static void main(String[] args) {

        File inputFile = new File("C:\\Users\\danie\\Downloads\\Profile.pdf");
        File outputFile = new File("C:\\Users\\danie\\Downloads\\Profile.pdf");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {

        InputStream input = null;
        OutputStream output = null;

        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }

        } finally {

        }

    }


}
