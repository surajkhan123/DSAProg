package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData1 {
  public static void main(String[] args) throws IOException{
    FileReader f = new FileReader("C:\\Users\\suraj\\OneDrive\\Desktop\\B.txt");
    BufferedReader bf = new BufferedReader(f);
    String s = bf.readLine();
    while (s != null) {
      System.out.println(s);
      s = bf.readLine();
    } bf.close();
    
  }
  
}
