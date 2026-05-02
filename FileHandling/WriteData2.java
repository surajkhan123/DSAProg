package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData2 {
  public static void main(String[] args) throws IOException {
    FileOutputStream f = new FileOutputStream("C:\\Users\\suraj\\OneDrive\\Desktop\\A.txt");
    String s ="RCB";
    // f.write(s); //CTE
    byte[] b = s.getBytes();
    f.write(b);
    f.close();
    
  }
}
