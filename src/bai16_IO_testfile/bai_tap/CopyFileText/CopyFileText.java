package bai16_IO_testfile.bai_tap.CopyFileText;

import java.io.*;

public class CopyFileText {
    public static void copyFile(String sourFile, String targetFile) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = new FileInputStream(sourFile);
            outStream = new FileOutputStream(targetFile);
            int length;
            int sum = 0;
            byte[] buffer = new byte[1024];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
                sum += length;
            }
            System.out.println("File is copied successful!");
            System.out.println("Tổng các ký tự: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("MyText.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Võ");
            bufferedWriter.write("Tiến");
            bufferedWriter.write("Huy");
            bufferedWriter.write("Đông");
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        copyFile("MyText.txt", "MyText2.txt");
    }
}

