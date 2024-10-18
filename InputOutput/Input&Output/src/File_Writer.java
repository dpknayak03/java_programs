import java.io.*;
import java.io.IOException;
//g
import java.util.Scanner;
public class File_Writer {
  public static void main(String[] args) throws IOException {
    
    FileWriter writer = new FileWriter("output.txt");

    
    String outputText = "We love learning to code with Codecademy. ssdgdgd";
    writer.write(outputText);
    writer.close();
  }
}