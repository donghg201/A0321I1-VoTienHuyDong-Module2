package bai16_IO_testfile.bai_tap.DocFileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Info.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List<NationalInfo> list = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] nation = line.split(",");
                NationalInfo nationalInfo = new NationalInfo(nation[0], nation[1], nation[2], nation[3], nation[4], nation[5]);
                list.add(nationalInfo);
            }
            for(NationalInfo nationalInfo: list){
                System.out.println(nationalInfo.toString());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
