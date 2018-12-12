package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/mohammadsharkar/Desktop/practice/tuesday.txt";

        FileReader fr = new FileReader(path);
        System.out.println("The File reader found the path as: "+path);

        BufferedReader br = new BufferedReader(fr);
        String data = "";
        while((data=br.readLine())!=null){
            System.out.println("the Buffered reader can buffer the file  "+data);
        }


    }


}
