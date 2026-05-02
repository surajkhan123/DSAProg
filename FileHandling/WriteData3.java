package FileHandling;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData3 {
  public static void main(String[] args) throws IOException {
    
    FileWriter f = new FileWriter("C:\\Users\\suraj\\OneDrive\\Desktop\\A.txt\\");
    BufferedWriter bf = new BufferedWriter(f);
    bf.write("Like");
    bf.newLine();
    bf.write("Share");
    bf.close();
  }
}  
