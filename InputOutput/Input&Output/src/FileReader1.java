
import java.io.IOException;
import java.io.FileReader;

public class FileReader1 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java_practicby_deepak\\InputOutput\\Input&Output\\src\\input.txt";
        FileReader reader = new FileReader(path);
        int counter = 0;
        while ((counter = reader.read()) != -1) {    
          System.out.print((char)counter);    
        } 
        reader.close();
      }
    
}
